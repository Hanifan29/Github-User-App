package com.abduhanifan.dicoding.githubuserapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListUserAdapter(val listGit: ArrayList<Git>) :
    RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_user, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGit.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listGit[position]

        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions())
            .into(holder.imgAvatar)

        holder.tvUsername.text = user.username
        holder.tvCompany.text = user.company

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val mGitUser = Intent(mContext, DetailActivity::class.java)
            mGitUser.putExtra(DetailActivity.EXTRA_AVATAR, user.avatar)
            mGitUser.putExtra(DetailActivity.EXTRA_USERNAME, user.username)
            mGitUser.putExtra(DetailActivity.EXTRA_NAME, user.name)
            mGitUser.putExtra(DetailActivity.EXTRA_COMPANY, user.company)
            mGitUser.putExtra(DetailActivity.EXTRA_LOCATION, user.location)
            mGitUser.putExtra(DetailActivity.EXTRA_REPOSITORY, user.repository)
            mGitUser.putExtra(DetailActivity.EXTRA_FOLLOWER, user.follower)
            mGitUser.putExtra(DetailActivity.EXTRA_FOLLOWING, user.following)
            mContext.startActivity(mGitUser)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Git)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvUsername: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCompany: TextView = itemView.findViewById(R.id.tv_company)
        var imgAvatar: ImageView = itemView.findViewById(R.id.img_item_avatar)
    }
}