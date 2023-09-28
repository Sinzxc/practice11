package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Images
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View){
        val image: Int= R.drawable.two;
        val imagePlace = findViewById<ImageView>(R.id.imageView1);
        imagePlace.setImageResource(image);
    }
    var click=false;

    fun onClickImage (view: View){
        val imageBtn = findViewById<ImageButton>(R.id.imageButton3);
        if(click==false)
        {
            imageBtn.setImageResource(R.drawable.t);
            click=!click;
        }else
        {
            imageBtn.setImageResource(R.drawable.f);
            click=!click;
        }
    }
}