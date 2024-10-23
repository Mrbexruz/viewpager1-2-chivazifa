package com.likobehruz.viewpager2chivazifa

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.tabs.TabLayout
import com.likobehruz.viewpager2chivazifa.adapter.MyPagerAdapter
import com.likobehruz.viewpager2chivazifa.databinding.ActivityMainBinding
import com.likobehruz.viewpager2chivazifa.utils.MyData

class MainActivity : AppCompatActivity() {
    lateinit var myPagerAdapter: MyPagerAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addUser()


        myPagerAdapter = MyPagerAdapter(MyData.list)
        binding.pg.adapter = myPagerAdapter
        binding.myTab.setupWithViewPager(binding.pg)

        loadTabLayout()
        binding.btnNext.setOnClickListener {
            val nextItem = binding.pg.currentItem + 1
            if (nextItem <myPagerAdapter.count) {
                binding.pg.currentItem = nextItem
            }
        }
        binding.btnQaytish.setOnClickListener {
            val nextItem = binding.pg.currentItem - 1
            if (nextItem <myPagerAdapter.count) {
                binding.pg.currentItem = nextItem
            }
        }
    }

    private fun loadTabLayout() {
        val tabCount = binding.myTab.tabCount
        for (i in 0 until tabCount) {
            val tabView = LayoutInflater.from(this).inflate(R.layout.item_tab_layout, null, false)
            val tab = binding.myTab.getTabAt(i)
            tab?.customView = tabView
            val imageView = tabView.findViewById<ImageView>(R.id.img_circle)
            if (i == 0) {
                imageView.setImageResource(R.drawable.icon_1)
            } else {
                imageView.setImageResource(R.drawable.icon_2)
            }
        }
        binding.myTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val costomView = tab?.customView
                val image = costomView?.findViewById<ImageView>(R.id.img_circle)
                image?.setImageResource(R.drawable.icon_1)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                val costomView = tab?.customView
                val image = costomView?.findViewById<ImageView>(R.id.img_circle)
                image?.setImageResource(R.drawable.icon_2)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })



    }
}