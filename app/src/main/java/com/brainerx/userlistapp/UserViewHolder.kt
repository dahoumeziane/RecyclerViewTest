package com.brainerx.userlistapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_user.view.*

class UserViewHolder(itemView : View) :
    RecyclerView.ViewHolder(itemView) {

        val userName : TextView = itemView.username
        val userMail : TextView = itemView.user_mail
        val userProfession : TextView = itemView.user_profession
        val userPicture : ImageView = itemView.user_image
}