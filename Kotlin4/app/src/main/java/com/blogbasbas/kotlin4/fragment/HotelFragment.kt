package com.blogbasbas.kotlin4.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blogbasbas.kotlin4.POJO.Result

import com.blogbasbas.kotlin4.R
import com.blogbasbas.kotlin4.adapter.CustomAdapter
import com.blogbasbas.kotlin4.model.ModelHotel
import com.blogbasbas.kotlin4.presenter.PresenterHotel
import kotlinx.android.synthetic.main.fragment_hotel.*


/**
 * A simple [Fragment] subclass.
 */
class HotelFragment : Fragment(), ModelHotel {


    var presenter :PresenterHotel?=null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.fragment_hotel, container, false)

         presenter = PresenterHotel(this)

        presenter?.getHotel("-6.1925297,106.8001397",1000
                ,"hospital","AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")

        return view
    }


    override fun Succes(data: List<Result>, status: String) {
            var  adapter = CustomAdapter(data, activity)
            recyclerview.adapter=adapter
            var linear = LinearLayoutManager(activity)
            recyclerview.layoutManager = linear

        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


    }

    override fun Error(error: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}// Required empty public constructor
