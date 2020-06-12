package com.abduhanifan.dicoding.githubuserapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail User"

        val imgAvatar: ImageView = findViewById(R.id.img_item_avatar)
        val tvUsername: TextView = findViewById(R.id.tv_username)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvCompany: TextView = findViewById(R.id.tv_company)
        val tvLocation: TextView = findViewById(R.id.tv_location)
        val tvRepository: TextView = findViewById(R.id.tv_repository)
        val tvFollower: TextView = findViewById(R.id.tv_follower)
        val tvFollowing: TextView = findViewById(R.id.tv_following)

        val tImg = intent.getIntExtra(EXTRA_AVATAR, 0)
        val tUsername = intent.getStringExtra(EXTRA_USERNAME)
        val tName = intent.getStringExtra(EXTRA_NAME)
        val tCompany = intent.getStringExtra(EXTRA_COMPANY)
        val tLocation = intent.getStringExtra(EXTRA_LOCATION)
        val tRepository = intent.getStringExtra(EXTRA_REPOSITORY)
        val tFollower = intent.getStringExtra(EXTRA_FOLLOWER)
        val tFollowing = intent.getStringExtra(EXTRA_FOLLOWING)

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgAvatar)
        tvUsername.text = tUsername
        tvName.text = tName
        tvCompany.text = tCompany
        tvLocation.text = tLocation
        tvRepository.text = tRepository
        tvFollower.text = tFollower
        tvFollowing.text = tFollowing
    }

    companion object {
        const val EXTRA_AVATAR = "extra_avatar"
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_COMPANY = "extra_company"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_REPOSITORY = "extra_repository"
        const val EXTRA_FOLLOWER = "extra_follower"
        const val EXTRA_FOLLOWING = "extra_following"
    }
}
