package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMix=findViewById<Button>(R.id.mix);

        val checkRed=findViewById<CheckBox>(R.id.red);
        val checkBlue=findViewById<CheckBox>(R.id.blue);
        val checkYellow=findViewById<CheckBox>(R.id.yellow);
        btnMix.setOnClickListener{
            val i=Intent(this,SecondActivity::class.java);
            if(checkRed.isChecked && checkBlue.isChecked && checkYellow.isChecked){
                i.putExtra("1","Red & Blue & Yellow");
            }else{
                if(checkRed.isChecked && checkBlue.isChecked){
                    i.putExtra("1","Red & Blue");
                }else{
                    if(checkRed.isChecked && checkYellow.isChecked){
                        i.putExtra("1","Red & Yellow");
                    }else{
                        if(checkBlue.isChecked && checkYellow.isChecked){
                            i.putExtra("1","Blue & Yellow");
                        }else{
                            if(checkRed.isChecked){
                                i.putExtra("1","Red");
                            }else{
                                if(checkBlue.isChecked){
                                    i.putExtra("1","blue");
                                }else{
                                    i.putExtra("1","yellow");
                                }
                            }
                        }
                    }
                }
            }
            startActivity(i);

        }
    }
}