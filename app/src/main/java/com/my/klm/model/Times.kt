package com.my.klm.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Times (
	val scheduled : String,
	val latestPublished : String,
	val estimated : Estimated?
): Parcelable