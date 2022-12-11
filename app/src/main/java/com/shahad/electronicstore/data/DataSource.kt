package com.shahad.electronicstore.data

import com.shahad.electronicstore.Modul.Item
import com.shahad.electronicstore.R

 class DataSource{


    fun loaditems() : List<Item> {
        return listOf(
            Item(R.drawable.bookmark1, R.string.item1,R.string.item11),
            Item(R.drawable.bookmark2, R.string.item2,R.string.item12),
            Item(R.drawable.bookmark3, R.string.item3,R.string.item13),
            Item(R.drawable.bookmark4, R.string.item4,R.string.item14),
            Item(R.drawable.bookmark5, R.string.item5,R.string.item15),
            Item(R.drawable.bookmark6, R.string.item6,R.string.item16),
            Item(R.drawable.bookmark7, R.string.item7,R.string.item17),
            Item(R.drawable.bookmark8, R.string.item8,R.string.item18),
            Item(R.drawable.bookmark9, R.string.item9,R.string.item19)



        ) // end of return
    }
}
