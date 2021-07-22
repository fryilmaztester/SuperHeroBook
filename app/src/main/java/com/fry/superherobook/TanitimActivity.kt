package com.fry.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val choosenHero = intent.getStringExtra("SuperHeroNAME")
        superHeroText.text = choosenHero

        val secilenKahraman = intent.getIntExtra("SuperHeroImages",0)
        val bitMap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahraman)

/*        val secilenKahraman = SingletonClassss.secilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)

 */
    }
}