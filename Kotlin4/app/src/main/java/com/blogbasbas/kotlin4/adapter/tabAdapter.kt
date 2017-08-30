package com.blogbasbas.kotlin4.adapter

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.blogbasbas.kotlin4.fragment.HospitalFragment
import com.blogbasbas.kotlin4.fragment.HotelFragment
import com.blogbasbas.kotlin4.fragment.RestaurantFragment

/**
 * Created by Server on 25/08/2017.
 */
class tabAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): android.support.v4.app.Fragment {
       if (position == 0) {
           return HotelFragment()
       }
        else if(position == 1){
           return RestaurantFragment()
       } else{
           return HospitalFragment()
       }


        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return 3
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}