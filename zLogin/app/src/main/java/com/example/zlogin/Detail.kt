package com.example.zlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zlogin.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var img = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        img = intent.getIntExtra(FactAdapter.IMG_EXTRAS,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)

        setUpDetail()
    }


    private fun setUpDetail(){
        binding?.tvDetail?.text = detail
        binding?.ivImageDetail?.setImageResource(img)
        title=name

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}