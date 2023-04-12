package com.example.vapeur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stime.ModelTopList
import com.example.stime.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing_page)

        val modelTopList = listOf(
            ModelTopList("Jeu 1", 10, 20),
            ModelTopList("Jeu 2", 20, 30),
            ModelTopList("Jeu 3", 30, 40)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = itemAdapter(modelTopList)
    }

    class itemAdapter(private val list: List<ModelTopList>) :
        RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_layout, parent, false)
            return MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val model = list[position]
            holder.gameName.text = model.gameName
            holder.topFriends.text = model.topFriends.toString()
            holder.topFrance.text = model.topFrance.toString()
        }

        override fun getItemCount(): Int {
            return list.size
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gameName: TextView = itemView.findViewById(R.id.gameName)
        val topFriends: TextView = itemView.findViewById(R.id.topFriends)
        val topFrance: TextView = itemView.findViewById(R.id.topFrance)
    }
}

