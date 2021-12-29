package com.fahrezi.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fahrezi.foodapp.adapter.RecentCardAdapter
import com.fahrezi.foodapp.adapter.TrendingBannerAdapter
import com.fahrezi.foodapp.databinding.ActivityMainBinding
import com.fahrezi.foodapp.model.RecentModel
import com.fahrezi.foodapp.model.TrendingBannerModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //add trending adapter
        val listTrendingBanner = arrayListOf<TrendingBannerModel>()
        addListTrendingBanner(listTrendingBanner)
        binding.recyclerViewTrending.adapter = TrendingBannerAdapter(listTrendingBanner)

        //add recent adapter
        val listRecent = arrayListOf<RecentModel>()
        addListRecent(listRecent)
        binding.recyclerViewRecent.adapter = RecentCardAdapter(listRecent)
    }

    fun addListTrendingBanner(listTrendingBannerModel: ArrayList<TrendingBannerModel>) {
        listTrendingBannerModel.add(
            TrendingBannerModel(
                R.drawable.food_1,
                "Ayam Bakar",
                "30.10 Min",
                423
            )
        )
        listTrendingBannerModel.add(
            TrendingBannerModel(
                R.drawable.food_2,
                "Pizza Nasi",
                "20.10 Min",
                723
            )
        )
        listTrendingBannerModel.add(
            TrendingBannerModel(
                R.drawable.food_3,
                "Taichan",
                "32.10 Min",
                1033
            )
        )
    }

    fun addListRecent(listRecentModel: ArrayList<RecentModel>) {
        listRecentModel.add(
            RecentModel(
                "Aji", "Ayam Bakar", "Masak ayam bakar kesukaan si kecil",
                "30.10 Min",
                423
            )
        )

        listRecentModel.add(
            RecentModel(
                "Aji", "Pizza Nasi", "Buat Pizza pakai nasi?",
                "20.10 Min",
                723
            )
        )

        listRecentModel.add(
            RecentModel(
                "Aji", "Taichan", "Chinese foood juga enak  nih",
                "32.10 Min",
                1033
            )
        )


    }
}