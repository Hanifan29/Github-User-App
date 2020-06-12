package com.abduhanifan.dicoding.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.abduhanifan.dicoding.githubuserapp.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var rvUser: RecyclerView
    private var list: ArrayList<User> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUser = findViewById(R.id.rv_user)
        rvUser.setHasFixedSize(true)
    }
}
