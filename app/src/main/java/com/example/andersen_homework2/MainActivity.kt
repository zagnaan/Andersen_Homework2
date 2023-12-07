package com.example.andersen_homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(url: String){
    Glide.with(this.context)
        .load(url)
        .into(this)
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageUrl = "https://people.com/thmb/rrT3xyYMQjE54AyYWTEPbRyPrX0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(1019x505:1021x507)/hine-2000-4c3939a4483e4decae3c1e10f778afd2.jpg"
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.loadImage(imageUrl)

    }
}