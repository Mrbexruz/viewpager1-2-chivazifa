package com.likobehruz.viewpager2chivazifa.utils

import com.likobehruz.viewpager2chivazifa.R
import com.likobehruz.viewpager2chivazifa.models.User

object MyData {
  val list = ArrayList<User>()

    fun addUser(){
        list.add(
            User("Click va Paymega o'tish xizmati",
                "Payme tolov qilish juda qulay",
                "Clickni ko'p jihatlari bir",
                "biriga juda o'xshaydi",
                R.drawable.img)
        )
        list.add(
            User("Barcha operatorlar bo'yicha statistika",
                "Payme tolov qilish juda qulay",
                "Clickni ko'p jihatlari bir",
                "biriga juda o'xshaydi",
                R.drawable.img_1)
        )
        list.add(
            User("Tariflarni filtrlash",
                "Payme tolov qilish juda qulay",
                "Clickni ko'p jihatlari bir",
                "biriga juda o'xshaydi",
                R.drawable.img_2)
        )
        list.add(
            User("Yangi imkoniyatlar",
                "Payme tolov qilish juda qulay",
                "Clickni ko'p jihatlari bir",
                "biriga juda o'xshaydi",
                R.drawable.img_3)
        )

    }
}