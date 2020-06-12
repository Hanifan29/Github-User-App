package com.abduhanifan.dicoding.githubuserapp.model

import android.os.Parcel
import android.os.Parcelable

data class User(
    val username: String?,
    val name: String?,
    val company: String?,
    val location: String?,
    val repository: String?,
    val following: Int?,
    val follower: Int?,
    val avatar: Int?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(name)
        parcel.writeString(company)
        parcel.writeString(location)
        parcel.writeString(repository)
        parcel.writeValue(following)
        parcel.writeValue(follower)
        parcel.writeValue(avatar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}