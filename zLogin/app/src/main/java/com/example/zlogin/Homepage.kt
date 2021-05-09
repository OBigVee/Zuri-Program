package com.example.zlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zlogin.databinding.ActivityHomepageBinding


class Homepage : AppCompatActivity() {

    var binding: ActivityHomepageBinding? = null
    var adapter:FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_homepage)
        setContentView(binding?.root)
        setUpFact()
    }




    private fun setUpFact(){
        adapter = FactAdapter(this,Data.theFacts)
        binding?.lvFacts?.adapter = adapter
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}