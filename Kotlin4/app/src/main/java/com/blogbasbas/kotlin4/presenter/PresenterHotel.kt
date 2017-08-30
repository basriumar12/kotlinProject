package com.blogbasbas.kotlin4.presenter

import com.blogbasbas.kotlin4.Init.InitRetrofit
import com.blogbasbas.kotlin4.POJO.ResponseJSON
import com.blogbasbas.kotlin4.model.ModelHotel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Server on 25/08/2017.
 */
class PresenterHotel {
    var model : ModelHotel? =null

    constructor(model: ModelHotel?) {
        this.model = model
    }

    fun getHotel(locatiion : String, radius : Int, type :String, key : String){
        //rx java
        InitRetrofit().getInctance()
                .request_nearby(locatiion,radius,type,key)
                //create treaad baru
                .subscribeOn(Schedulers.newThread())
                //kalau ada operator untuk pindak operator
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    //hasil subscribe di observable
                    t:ResponseJSON? ->
                    var  data = t?.results

                    var pesan = t?.status
                    if (data?.size!! > 0){
                        model?.Succes(data, pesan!!)

                    } else{
                        model?.Error(pesan!!)
                    }
                })
}}