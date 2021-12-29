package com.fahrezi.foodapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fahrezi.foodapp.databinding.ItemRecentBinding
import com.fahrezi.foodapp.databinding.ItemTrendingBannerBinding
import com.fahrezi.foodapp.model.RecentModel

class RecentCardAdapter(val listRecentModel: List<RecentModel>) :
    RecyclerView.Adapter<RecentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder {
        val binding =
            ItemRecentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {
        holder.bind(listRecentModel.get(position))
    }

    override fun getItemCount(): Int {
        return listRecentModel.size
    }
}

class RecentViewHolder(val binding: ItemRecentBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data: RecentModel) {

    }
}