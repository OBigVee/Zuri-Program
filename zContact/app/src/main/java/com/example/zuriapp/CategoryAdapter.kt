package com.example.zuriapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zuriapp.databinding.CategoryListRvBinding

class CategoryAdapter(
        private val categories: List<String>,
        private val listener:(String)->Unit):
        RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){


    inner  class CategoryViewHolder(private val categoryListRvBinding: CategoryListRvBinding):
            RecyclerView.ViewHolder(categoryListRvBinding.root){
                fun bind(category:String){
                    categoryListRvBinding.tvCategories.text = category
                    categoryListRvBinding.root.setOnClickListener {
                        listener.invoke(category)
                    }
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       return CategoryViewHolder(CategoryListRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
       holder.bind(categories[position])

    }

    override fun getItemCount(): Int {
        return categories.size
    }
}