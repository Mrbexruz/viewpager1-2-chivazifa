package com.likobehruz.viewpager2chivazifa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.likobehruz.viewpager2chivazifa.databinding.ItemPageBinding
import com.likobehruz.viewpager2chivazifa.models.User

class MyPagerAdapter ( var list : ArrayList<User>):PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val itemPageBinding = ItemPageBinding.inflate(LayoutInflater.from(container.context), container, false)
        itemPageBinding.image.setImageResource(list[position].image)
        itemPageBinding.tv1.text =list[position].tv1
        itemPageBinding.tv2.text = list[position].tv2
        itemPageBinding.tv3.text = list[position].tv3
        itemPageBinding.tv4.text = list[position].tv4
        container.addView(itemPageBinding.root)
       return itemPageBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
     container.removeView(`object` as View)
    }


}