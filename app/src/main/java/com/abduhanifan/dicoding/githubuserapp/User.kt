package com.abduhanifan.dicoding.githubuserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val username: String?,
    val name: String?,
    val company: String?,
    val location: String?,
    val repository: String?,
    val following: Int?,
    val follower: Int?,
    val avatar: Int?
) : Parcelable