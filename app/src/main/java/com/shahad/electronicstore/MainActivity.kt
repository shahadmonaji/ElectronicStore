package com.shahad.electronicstore

import ItemAdapter
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shahad.electronicstore.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val datset = DataSource().loaditems()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_id)
        val adapter = ItemAdapter(this, datset)
        recyclerView.adapter = adapter


        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

         recyclerView.setHasFixedSize(true)


        //adding explicit intent
//        val itemimg = findViewById<RecyclerView>(R.id.rv_id)
//
//        itemimg.setOnClickListener {
//            // your code to perform when the user clicks on the ImageView
//            Toast.makeText(this@MainActivity, "You clicked on ImageView.", Toast.LENGTH_SHORT).show()
//        }

    }// end of OnCreate function
//
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_mnue,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId==R.id.Share_mnue){
            val shareIntent= Intent().apply {
                this.action=Intent.ACTION_SEND
                this.putExtra(Intent.EXTRA_TEXT,"take a look on my new products!")
                this.type="text/plain"
            }
            startActivity(shareIntent)

        }else{
            return super.onOptionsItemSelected(item)
        }
        return true
    }
}

