package com.example.zuriapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.zuriapp.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private val adapter = ContactAdapter ()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        val assertExtra = intent.getStringExtra(MainActivity.ARGS)
        if ( assertExtra != null){
            title = assertExtra

        }
        setupData(binding)
    }

    fun setupData(binding: ActivityMain2Binding){

        binding.rvContact.adapter = adapter
        val builder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val view: View = inflater.inflate(R.layout.add_contact_dialog,null)
        builder.setView(view)

        val name = view.findViewById<TextView>(R.id.etName)
        val phone = view.findViewById<TextView>(R.id.etPhoneNumber)
        val btnSave = view.findViewById<Button>(R.id.btnSave)
        phone.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                btnSave.isEnabled = s?.length == 11
            }
            override fun afterTextChanged(s: Editable?) {
            }

        })
        val alertDialog =builder.create()

        btnSave.setOnClickListener {
            val contact = Contact(name.text.toString(), phone.text.toString())
            val contacts = mutableListOf(contact)
            adapter.setupContacts(contacts)
            alertDialog.dismiss()
        }


        binding.fab.setOnClickListener{
            alertDialog.show()
        }
    }

}