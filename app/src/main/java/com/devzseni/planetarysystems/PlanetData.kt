package com.devzseni.planetarysystems

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlanetData(
    val id: Int?,
    val title: String?,
    val galaxy: String?,
    val distance:String?,
    val gravity:String?,
    val overView:String?,
):Parcelable
