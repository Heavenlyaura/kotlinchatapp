package com.example.kotlinchatapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val context: Context, val userList: ArrayList<User>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.user_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: UserViewHolder,
        position: Int
    ) {
        val currentUser = userList[position]
        holder.textName.text = currentUser.firstname
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var textName = itemView.findViewById<TextView>(R.id.txt_name)
    }
}