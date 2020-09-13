package com.example.recyclerviewexample

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val users: ArrayList<User>, private val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        Log.d("[size]", "test")
        return users.size
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        (holder as viewHolder).name.text =users[position].name
        holder.age.text =users[position].age.toString()
        holder.btn.setOnClickListener {
            Toast.makeText(context, "${users[position].name} 상세정보 페이지 이동", Toast.LENGTH_LONG).show()
        }
    }

    class viewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById<TextView>(R.id.tv_name)
        val age: TextView = itemView.findViewById<TextView>(R.id.tv_age)
        val btn: Button = itemView.findViewById<Button>(R.id.btn_detail)
    }
}