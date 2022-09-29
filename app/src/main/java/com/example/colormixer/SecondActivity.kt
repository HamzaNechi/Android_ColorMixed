package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val radPurple=findViewById<RadioButton>(R.id.purple);
        val radGreen=findViewById<RadioButton>(R.id.green);
        val radOrange=findViewById<RadioButton>(R.id.orange);
        val ex:String = intent.getStringExtra("1").toString();
        val text=findViewById<TextView>(R.id.you);
        text.setText(ex);

        val btnSubmit=findViewById<Button>(R.id.btnSubmit);

        btnSubmit.setOnClickListener{
            val i= Intent(this,ReponseActivity::class.java);

            if(ex.equals("Red & Blue & Yellow") && radPurple.isChecked){
                i.putExtra("2","Success");
            }else{
                if(ex.equals("Red & Blue") && radPurple.isChecked){
                    i.putExtra("2","Success");
                }else{
                    if(ex.equals("Red & Yellow") && radOrange.isChecked){
                        i.putExtra("2","Success");
                    }else{
                        if(ex.equals("Blue & Yellow") && radGreen.isChecked){
                            i.putExtra("2","Success");
                        }else{
                            i.putExtra("2","Error");
                        }
                    }
                }
            }


            startActivity(i);
        }
    }
}