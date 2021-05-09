package com.example.zlogin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FactAdapter (context: Context,facts:List<FactModel>): ArrayAdapter <FactModel>(context,0,facts){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view =  convertView

        val facts = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        }

        val image = view?.findViewById<ImageView>(R.id.imageViewPic)
        val name = view?.findViewById<TextView>(R.id.tvfactName)

        facts?.image?.let { image?.setImageResource(facts.image) }
        name?.text =  facts?.name

        view?.setOnClickListener{
            val intent = Intent(parent.context, Detail::class.java)
            intent.putExtra(IMG_EXTRAS,facts?.image)
            intent.putExtra(NAME_EXTRAS,facts?.name)
            intent.putExtra(FACT_EXTRAS,facts?.factz)
            parent.context.startActivity(intent)
        }
        return view!!
    }

    companion object{
        val  IMG_EXTRAS = "imgExtras"
        val NAME_EXTRAS = "nameExtras"
        val FACT_EXTRAS = "factExtras"
    }

}