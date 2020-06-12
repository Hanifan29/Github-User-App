package com.abduhanifan.dicoding.githubuserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Git(
    var username: String? = "",
    var name: String? = "",
    var company: String? = "",
    var location: String? = "",
    var repository: String? = "",
    var follower: String? = "",
    var following: String? = "",
    var avatar: Int? = 0
) : Parcelable