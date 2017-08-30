package com.blogbasbas.kotlin4.adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.blogbasbas.kotlin4.POJO.Result
import com.blogbasbas.kotlin4.R
import com.bumptech.glide.Glide

/**
 * Created by Server on 25/08/2017.
 */
class CustomAdapter : RecyclerView.Adapter<CustomAdapter.Myholder>{
    override fun getItemCount(): Int {

        return data!!.size
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: Myholder?, position: Int) {
        holder?.txt?.setText(data?.get(position)!!.name)

        Glide.with(c).load(data?.get(position)!!.photos).into(holder?.img)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Myholder {
        var inflater =  LayoutInflater.from(c).inflate(R.layout.custom_list,parent,false)

        return Myholder(inflater)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var data : List<Result>? = null
    var c : FragmentActivity? =null

    constructor(data: List<Result>?, c: FragmentActivity?) {
        this.data = data
        this.c = c
    }

    class Myholder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var img = itemView?.findViewById<View>(R.id.img) as ImageView
        var txt = itemView?.findViewById<View>(R.id.txtname) as TextView



    }
}