package com.blogbasbas.kotlin4.POJO

import com.google.gson.annotations.SerializedName


class Location {

    @SerializedName("lat")
    var lat: Double? = null
    @SerializedName("lng")
    var lng: Double? = null

}
