package com.brainerx.userlistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_user.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = ArrayList<UserModel>()
        users.add(UserModel("Ahmed karim","ahmedkarim@gmail.com","Detective","https://as1.ftcdn.net/jpg/05/04/54/80/220_F_504548087_fiTjHtIjKs1WMhtzhCxn8uK2Gtt3ujdj.jpg"))
        users.add(UserModel("Yassmine belkhdar","yassmine@khdar.com","Fleuriste","https://assets.stickpng.com/images/585e4bc4cb11b227491c3395.png"))
        users.add(UserModel("Amira bouhchicha","bouhchicha@amira.com","Princess","https://i.pinimg.com/736x/c6/de/f8/c6def820423905d6d90fac4ef747190a.jpg"))
        users.add(UserModel("Karim belhadj","karimbelhadj@usma.com","Clown","https://www.algerie360.com/wp-content/uploads/2018/10/karim-belhadj.jpg"))
        users.add(UserModel("Nessrine Belkacem","nessrine@belkacem.com","Nothing","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.juisci.com%2Fdocteurs%2Fkheireddine-karim-belhadj&psig=AOvVaw1ozi0fMKC7hcsRhcu1xA7o&ust=1704289062232000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCNiPp9bpvoMDFQAAAAAdAAAAABAI"))

        val adapter = UserAdapter(users,this)
        users_list.adapter= adapter
        val manager = LinearLayoutManager(this)
            //  manager.orientation = LinearLayoutManager.HORIZONTAL
        users_list.layoutManager = manager
    }
}