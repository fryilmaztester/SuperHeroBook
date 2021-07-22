package com.fry.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycler_row.view.*
import java.util.ArrayList

class RecycleAdapter (val superHeroNameRec: ArrayList<String>, val superHeroImagesRec : ArrayList<Int>) : RecyclerView.Adapter<RecycleAdapter.SuperHeroVH>() {

    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {

        //ViewHolder sınıfı oluşturlğuda yapılacka işlemler

        //Inflater, LayoutInflater, MenuInflater

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)

        //recycler_row ile görünümümüzü birbirine bağlamaya yardımcı olacaktır.

        return SuperHeroVH(itemView)
    }


    override fun getItemCount(): Int {

        //RC içinde kaç sıra olacak onu söylememiz gerekir.

        return superHeroNameRec.size

    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {

        holder.itemView.recyclerViewTextView.text = superHeroNameRec.get(position)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("SuperHeroNAME",superHeroNameRec.get(position))

            intent.putExtra("SuperHeroImages",superHeroImagesRec.get(position))


            /*
            val singleton = SingletonClassss.secilenKahraman
            singleton.gorsel = superHeroImagesRec.get(position)*/
            holder.itemView.context.startActivity(intent)
        }
    }


}