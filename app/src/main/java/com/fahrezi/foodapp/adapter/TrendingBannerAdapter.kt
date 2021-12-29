package com.fahrezi.foodapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.fahrezi.foodapp.databinding.ItemTrendingBannerBinding
import com.fahrezi.foodapp.model.TrendingBannerModel

class TrendingBannerAdapter(val listTrendingBanner: List<TrendingBannerModel>) :
    RecyclerView.Adapter<TrendingBannerViewHolder>() {

    override fun getItemCount(): Int {
        return listTrendingBanner.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingBannerViewHolder {
        val binding =
            ItemTrendingBannerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendingBannerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrendingBannerViewHolder, position: Int) {
        holder.bind(listTrendingBanner.get(position))
    }

}

class TrendingBannerViewHolder(val binding: ItemTrendingBannerBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: TrendingBannerModel) {
        binding.imageBanner.setImageResource(data.imageUrl)
        binding.textTitle.text = data.title
        binding.textTime.text = data.time
        binding.textView.text = "${data.view} view"
    }
}