package com.blogbasbas.kotlin4.model

import com.blogbasbas.kotlin4.POJO.Result

/**
 * Created by Server on 25/08/2017.
 */
interface ModelHotel {

    fun Succes(data : List<Result>, status : String)

    fun Error (error: String)
}