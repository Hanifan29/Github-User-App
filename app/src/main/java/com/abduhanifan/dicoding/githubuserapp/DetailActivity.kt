package com.abduhanifan.dicoding.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val listUser: User = intent.getParcelableExtra(EXTRA_DATA)

        tv_username.text = listUser.username
        tv_name.text = listUser.name
        tv_company.text = listUser.company
        tv_location.text = listUser.location
        tv_repository.text = listUser.repository
        tv_following.text = listUser.following.toString()
        tv_follower.text = listUser.follower.toString()
        img_item_avatar.setImageResource(listUser.avatar!!)
    }

    companion object {
        var EXTRA_DATA = "0"
    }
}
