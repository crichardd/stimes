package com.example.stime

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vapeur.MainActivity

class ItemAdapter(private val list: List<ModelTopList>) : RecyclerView.Adapter<MainActivity.MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainActivity.MyViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_layout, parent, false)
            return MainActivity.MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MainActivity.MyViewHolder, position: Int) {
            val model = list[position]
            holder.gameName.text = model.gameName
            holder.topFriends.text = model.topFriends.toString()
            holder.topFrance.text = model.topFrance.toString()
        }

        override fun getItemCount(): Int {
            return list.size
        }


}

