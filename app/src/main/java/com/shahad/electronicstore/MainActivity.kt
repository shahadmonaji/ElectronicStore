package com.shahad.electronicstore

import ItemAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shahad.electronicstore.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




         //display a msg
//
//         val cardmassage = findViewById<Button>(.addButton)
//        cardmassage.setOnClickListener {
//            Toast.makeText(this,"Added to the card successfully!!",Toast.LENGTH_SHORT).show()
//        }



        val datset = DataSource().loaditems()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_id)
        val adapter = ItemAdapter(this, datset)
        recyclerView.adapter = adapter


        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

         recyclerView.setHasFixedSize(true)

    }
}