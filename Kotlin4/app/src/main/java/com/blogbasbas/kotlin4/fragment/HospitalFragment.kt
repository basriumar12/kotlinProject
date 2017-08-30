package com.blogbasbas.kotlin4.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.blogbasbas.kotlin4.R


/**
 * A simple [Fragment] subclass.
 */
class HospitalFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_hospital, container, false)
    }

}// Required empty public constructor
