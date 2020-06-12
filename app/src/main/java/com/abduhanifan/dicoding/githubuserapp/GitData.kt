package com.abduhanifan.dicoding.githubuserapp

object GitData {

    private val gitAvatar = intArrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )

    private val gitUsername = arrayOf(
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    )


    private val gitName = arrayOf(
        "Jake Wharton",
        "Amit Shekhar",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )

    private val gitCompany = arrayOf(
        "Google, Inc.",
        "MindOrksOpenSource",
        "Google",
        "Google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "gojek-engineering",
        "KotlinID",
        "JVMDeveloperID @Kotlin @IDDevOps",
        "Nusantara Beta Studio"
    )

    private val gitLocation = arrayOf(
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Sydney, Australia",
        "Trondheim, Norway",
        "India",
        "Kotagede, Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Bojongsoang - Bandung Jawa Barat",
        "Jakarta Indonesia"
    )

    private val gitRepository = arrayOf(
        "102",
        "37",
        "9",
        "30",
        "56",
        "28",
        "44",
        "110",
        "1064",
        "65"
    )

    private val gitFollower = arrayOf(
        "56995",
        "5153",
        "7972",
        "14725",
        "788",
        "18628",
        "277",
        "178",
        "428",
        "465"
    )

    private val gitFollowing = arrayOf(
        "12",
        "2",
        "0",
        "1",
        "0",
        "3",
        "39",
        "23",
        "61",
        "10"
    )

    val listData: ArrayList<Git>
        get() {
            val list = arrayListOf<Git>()
            for (position in gitUsername.indices) {
                val git = Git()
                git.avatar = gitAvatar[position]
                git.username = gitUsername[position]
                git.name = gitName[position]
                git.company = gitCompany[position]
                git.location = gitLocation[position]
                git.repository = gitRepository[position]
                git.follower = gitFollower[position]
                git.following = gitFollowing[position]
                list.add(git)
            }
            return list
        }
}