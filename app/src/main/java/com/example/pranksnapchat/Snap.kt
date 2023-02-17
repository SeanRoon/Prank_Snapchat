package com.example.pranksnapchat

import android.graphics.Color

data class Snap (val username: String, val time: Int, val profilePictureResourceID: Int, var opened: Boolean){

    val snapStatus: String
        get() =
            if(opened)
                "Received"
            else
                "New Snap"

    val iconResourceID: Int
        get() =
            if(opened)
                R.drawable.snap_recieved
            else
                R.drawable.new_snap

    val snapStatusColor: Int
        get() =
            if(opened)
                Color.GRAY
            else
                Color.parseColor("#F60047")
}

