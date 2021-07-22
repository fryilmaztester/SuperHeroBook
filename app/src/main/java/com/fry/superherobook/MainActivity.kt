package com.fry.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var superHeroName = ArrayList<String>()
        superHeroName.add("Superman")
        superHeroName.add("Batman")
        superHeroName.add("Aquaman")
        superHeroName.add("Spiderman")
        superHeroName.add("Ironman")



        /*Gorsel Hzırlığı

        -İki Farklı yolu vardır
            1) Verimsiz --> Bitmap
            2) Verimli
         */

        //1) Verimsiz

        /*
        val supermanBitMap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val batmanBitMap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val aquamanBitMap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitMap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val ironmanBitMap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)


        var superHeroImages = ArrayList<Bitmap>()
        superHeroImages.add(supermanBitMap)
        superHeroImages.add(batmanBitMap)
        superHeroImages.add(aquamanBitMap)
        superHeroImages.add(spidermanBitMap)
        superHeroImages.add(ironmanBitMap)

         */

        //2) Verimli

        val supermanDrawableId = R.drawable.superman
        val batmanDrawableId = R.drawable.batman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman
        val ironmanDrawableId = R.drawable.ironman

        var superKahramanList = ArrayList<Int>()
        superKahramanList.add(supermanDrawableId)
        superKahramanList.add(batmanDrawableId)
        superKahramanList.add(aquamanDrawableId)
        superKahramanList.add(spidermanDrawableId)
        superKahramanList.add(ironmanDrawableId)

        //Adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecycleAdapter(superHeroName,superKahramanList)
        recyclerView.adapter = adapter

    }
}