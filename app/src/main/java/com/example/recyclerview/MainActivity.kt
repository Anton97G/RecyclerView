package com.example.recyclerview

import CustomAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(R.drawable.apple, "apple", "600"))
        data.add(ItemsViewModel(R.drawable.asparagus, "asparagus", "1000"))
        data.add(ItemsViewModel(R.drawable.banana, "banana", "750"))
        data.add(ItemsViewModel(R.drawable.cabbage, "cabbage", "150"))
        data.add(ItemsViewModel(R.drawable.carrot, "carrot", "200"))
        data.add(ItemsViewModel(R.drawable.corn, "corn", "400"))
        data.add(ItemsViewModel(R.drawable.cucumber, "cucumber", "600"))
        data.add(ItemsViewModel(R.drawable.grapes, "grapes", "800"))
        data.add(ItemsViewModel(R.drawable.onion, "onion", "180"))
        data.add(ItemsViewModel(R.drawable.orange, "orange", "650"))
        data.add(ItemsViewModel(R.drawable.peach, "peach", "800"))
        data.add(ItemsViewModel(R.drawable.pear, "pear", "920"))
        data.add(ItemsViewModel(R.drawable.potato, "potato", "250"))


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


    }
}