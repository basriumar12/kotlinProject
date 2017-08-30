package com.blogbasbas.kotlin4.Init

import com.blogbasbas.kotlin4.API.ApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Server on 25/08/2017.
 */
class InitRetrofit {
    fun getInit() : Retrofit{
        return Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun getInctance(): ApiService{
        return getInit().create(ApiService::class.java)
    }
}