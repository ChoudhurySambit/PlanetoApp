package com.example.planeto

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class myAdapter (var planetsList:ArrayList<PlanetData>): RecyclerView.Adapter<myAdapter.myViewHolder>() {
    class myViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var planetName=itemView.findViewById<TextView>(R.id.planetName)

        var galaxyName=itemView.findViewById<TextView>(R.id.galaxyName)

        val planetImage=itemView.findViewById<ImageView>(R.id.planetImage)

        val planetDistance=itemView.findViewById<TextView>(R.id.planetDistance)

        val planetGravity=itemView.findViewById<TextView>(R.id.planetGravity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return myViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return planetsList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        holder.itemView.setOnClickListener {

            val intent = Intent (holder.itemView.context,PlanetInfo::class.java)

            intent.putExtra("planetName",planetsList[position].planetName)

            intent.putExtra("galaxyName",planetsList[position].galaxyName)

            intent.putExtra("planetImageId",planetsList[position].planetImage)

            intent.putExtra("planetDistance",planetsList[position].planetDistance)

            intent.putExtra("planetGravity",planetsList[position].planetGravity)

            intent.putExtra("overView",planetsList[position].planetOverView)

            holder.itemView.context.startActivity(intent)


        }

        holder.planetName.text=planetsList[position].planetName

        holder.galaxyName.text=planetsList[position].galaxyName

        holder.planetImage.setImageResource(planetsList[position].planetImage)

        holder.planetDistance.text=planetsList[position].planetDistance+" m km"

        holder.planetGravity.text=planetsList[position].planetGravity+" m/ss"

    }
}