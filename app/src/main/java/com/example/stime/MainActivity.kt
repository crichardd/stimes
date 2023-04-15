package com.example.vapeur

import Score
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stime.ItemAdapter
import com.example.stime.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing_page)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = mutableListOf<Score>()
        itemList.add(Score("Jeu 1", "Ami 1, Ami 2", "France 1, France 2"))
        itemList.add(Score("Jeu 2", "Ami 3, Ami 4", "France 3, France 4"))
        itemList.add(Score("Jeu 3", "Ami 5, Ami 6", "France 5, France 6"))

        val adapter = ItemAdapter(itemList)
        recyclerView.adapter = adapter
    }
}

