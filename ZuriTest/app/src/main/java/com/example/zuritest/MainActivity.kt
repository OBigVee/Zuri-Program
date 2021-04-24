package com.example.zuritest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var number:Int = 0;
     private val appTitle:TextView get() = findViewById(R.id.tv);
     private val btnIncrease:Button get() = findViewById<Button>(R.id.btnIncrease);
     private val btnDecrease:Button get() = findViewById<Button>(R.id.btnDecrease);
     private val result:TextView get()  = findViewById<TextView>(R.id.tvValue);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appTitle.text;
        result.text;
        btnIncrease.setOnClickListener {
            result.text = number++.toString();
        }

        btnDecrease.setOnClickListener{
            result.text = number--.toString();
        }

    }
}