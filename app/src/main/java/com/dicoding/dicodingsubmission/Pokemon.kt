package com.dicoding.dicodingsubmission

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pokemon (
    val photo: Int,
    val name: String,
    val rating: Int,
    val desc: String
    ) : Parcelable