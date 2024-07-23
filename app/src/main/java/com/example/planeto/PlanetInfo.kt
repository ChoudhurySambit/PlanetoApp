package com.example.planeto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlanetInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_info)


        val planetName=findViewById<TextView>(R.id.title_info)

        planetName.text=intent.getStringExtra("planetName")

        val galaxyName=findViewById<TextView>(R.id.galaxy_info)

        galaxyName.text=intent.getStringExtra("galaxyName")

        val planetImageId=findViewById<ImageView>(R.id.planetImageInfo)

        planetImageId.setImageResource(intent.getIntExtra("planetImageId",R.drawable.ic_earth))

        val planetDistance=findViewById<TextView>(R.id.distance_info)

        planetDistance.text=intent.getStringExtra("planetDistance")

        val planetGravity=findViewById<TextView>(R.id.gravity_info)

        planetGravity.text=intent.getStringExtra("planetGravity")

        val overView=findViewById<TextView>(R.id.overView)

        overView.text=intent.getStringExtra("overView")

    }
}