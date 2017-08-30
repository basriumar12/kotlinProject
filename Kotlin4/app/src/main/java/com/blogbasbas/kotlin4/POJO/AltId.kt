package com.blogbasbas.kotlin4.POJO

import com.google.gson.annotations.SerializedName

class AltId {

    @SerializedName("place_id")
    var placeId: String? = null
    @SerializedName("scope")
    var scope: String? = null

}
