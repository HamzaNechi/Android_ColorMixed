package com.example.colormixer

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Process.killProcess
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class ReponseActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reponse)
        this.setTitle("Success");
        //declaration
        val txt1=findViewById<TextView>(R.id.txt);
        val txt2=findViewById<TextView>(R.id.txt2);
        val frame=findViewById<FrameLayout>(R.id.frame);
        val img=findViewById<ImageView>(R.id.img);
        val btn=findViewById<Button>(R.id.btnS);


        //
        val e:String = intent.getStringExtra("2").toString();
        if(e.equals("Error")){
            this.setTitle("Error");
            txt1.setText("Sorry Android !");
            txt2.setText("Your answer is wrong");
            btn.setBackgroundColor(ContextCompat.getColor(this,R.color.red));
            frame.setBackgroundColor(ContextCompat.getColor(this,R.color.red));
            img.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, // Context
                    R.drawable.ic_baseline_warning_amber_24 // Drawable
                )
            )
        }

        btn.setOnClickListener{
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        }





    }
}
