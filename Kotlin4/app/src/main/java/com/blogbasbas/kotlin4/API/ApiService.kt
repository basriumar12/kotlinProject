package com.blogbasbas.kotlin4.API

import com.blogbasbas.kotlin4.POJO.ResponseJSON
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Server on 25/08/2017.
 */
interface ApiService {
    //sebagai get
    @GET("json")
    fun request_nearby (
            @Query("location") location: String,
            @Query("radius") radius :Int,
            @Query("type") type :String,
            @Query("key") key : String
    //proses emit to obsevable
    ) :Observable<ResponseJSON>
}