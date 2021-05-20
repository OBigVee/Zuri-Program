package com.example.zuriapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zuriapp.databinding.ContactListBinding

class ContactAdapter:RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){
    private  val contactList = mutableListOf<Contact>()

    inner class ContactViewHolder(private val binding:ContactListBinding):RecyclerView.ViewHolder(binding.root){
        fun bindItem(contact: Contact){
            binding.tvName.text = contact.name
            binding.tvPhoneNumber.text = contact.phoneNumber
        }
    }

    fun setupContacts(contact: List<Contact>){
        this.contactList.addAll(contact)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return  ContactViewHolder(
                ContactListBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false
                )
        )
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        holder.bindItem(contact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}