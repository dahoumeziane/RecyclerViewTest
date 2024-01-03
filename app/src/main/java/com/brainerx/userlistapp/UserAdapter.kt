package com.brainerx.userlistapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class UserAdapter(
    val data : ArrayList<UserModel>,
    val context : Context
) : RecyclerView.Adapter<UserViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_user,parent,false)
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.userName.text = data[position].name
        holder.userMail.text= data[position].email
        holder.userProfession.text= data[position].profession
        Picasso.get().load(data[position].profilePic).into(holder.userPicture)
        holder.itemView.setOnClickListener {
            Toast.makeText(context,data[position].name,Toast.LENGTH_SHORT).show()
        }
        if(data[position].profession=="Clown"){
            holder.userProfession.setTextColor(context.getColor(R.color.red))
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}
