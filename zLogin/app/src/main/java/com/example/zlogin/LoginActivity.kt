package com.example.zlogin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val email :EditText = findViewById(R.id.tfEmail)
        val password :EditText = findViewById(R.id.tfPassword)
        val facebook = findViewById<MaterialButton>(R.id.btnFB)
        val google = findViewById<MaterialButton>(R.id.btnG)
        val signInBtn = findViewById<MaterialButton>(R.id.btnSignIn)
        val signUpBtn = findViewById<Button>(R.id.textButton)

        signInBtn.setOnClickListener{
            if (email.text.toString() == "adedejivictor98@gmail.com" && password.text.toString() == "12345"){
              val intent =  Intent(this, Homepage::class.java)
                startActivity(intent)

                Log.d("auth","Passed")
            }
//            if (email.toString().isEmpty() && password.toString().isEmpty()){
//                val intent =  Intent(this, Homepage::class.java)
//                startActivity(intent)
//            }
            else{

                Snackbar.make(email,"Incorrect Email or Password",Snackbar.LENGTH_SHORT).show()
                Log.d("Auth","denied")
            }
        }


        facebook.setOnClickListener{
            val intent =  Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        google.setOnClickListener{
            val intent =  Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }






}