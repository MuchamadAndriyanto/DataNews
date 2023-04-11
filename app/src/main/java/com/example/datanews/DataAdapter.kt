package com.example.datanews

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.datanews.databinding.ItemDataBinding

class DataAdapter (private var listData : ArrayList<ListData>) : RecyclerView.Adapter<DataAdapter.ViewHolder>(){
    var onClick : ((ListData) -> Unit)? = null


    class ViewHolder (val binding : ItemDataBinding):RecyclerView.ViewHolder(binding.root){
        fun bindData(itemData : ListData){
            binding.data = itemData
            binding.lisData.setOnClickListener {
                val intent = Intent (binding.root.context, DetailNews::class.java)
                intent.putExtra("detailNews", itemData)
                binding.root.context.startActivity(intent)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapter.ViewHolder {
        var view = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //var dataProduct = listProduct[position]
        holder.bindData(listData[position])

    }

    override fun getItemCount(): Int {
        return listData.size
    }

}