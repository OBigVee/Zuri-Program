package com.example.zuriapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.GridLayout
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import com.example.zuriapp.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    var  binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        title = "Contact Category"

        val adapter = CategoryAdapter(Categories.listCategory){category ->
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(ARGS,category)
            startActivity(intent)
        }
        binding?.rvCategories?.layoutManager = GridLayoutManager(this,2)
       // binding?.rvCategories?.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL)
        binding?.rvCategories?.adapter = adapter
//        btnFamilyClick()
//        btnFriendsClick()
//        btnSchoolClick()
//        btnTechiesClick()
//        btnUnkClick()
//        btnWorkClick()
    }

//
//    private fun btnFamilyClick(){
//        binding?.btnFamily?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//            Log.d("Family", "clicked")
//        }
//    }
//
//    private fun btnFriendsClick(){
//        binding?.btnFriends?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//
//        }
//    }
//
//    private fun btnSchoolClick(){
//        binding?.btnSchool?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//
//        }
//    }
//
//    private fun btnWorkClick(){
//        binding?.btnWork?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//
//        }
//    }
//
//    private fun btnTechiesClick(){
//        binding?.btnTechies?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }
//    }
//
//    private fun btnUnkClick(){
//        binding?.btnUnk?.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }
//    }

    companion object{
        val ARGS = "args"
    }

}
