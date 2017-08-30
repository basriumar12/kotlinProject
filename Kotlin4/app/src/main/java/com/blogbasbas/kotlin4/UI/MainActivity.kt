package com.blogbasbas.kotlin4.UI

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.blogbasbas.kotlin4.R
import com.blogbasbas.kotlin4.adapter.tabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set icon and nama tabs
        tabs.addTab(tabs.newTab().setText("Hotel"))
        tabs.addTab(tabs.newTab().setText("Restaurant"))
        tabs.addTab(tabs.newTab().setText("Hospital"))


        //implementasi fragment each tabs

        var adapter = tabAdapter(supportFragmentManager)
        pager.adapter = adapter

        //kalau seandainya pagernya digeser tab juga terganti
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        //klik tab fragment brubah
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
  //              TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                //panggiln
                pager.setCurrentItem(tab?.position!!)


                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}
