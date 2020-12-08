package com.example.dolphins

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.dolphins.ui.main.SectionsPagerAdapter
import com.example.dolphins.ui.main.behaviorFrag
import com.example.dolphins.ui.main.introFrag
import com.example.dolphins.ui.main.respFrag

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        sectionsPagerAdapter.addFragment(introFrag(),"Intro")
        sectionsPagerAdapter.addFragment(respFrag(),"Breathing")
        sectionsPagerAdapter.addFragment(behaviorFrag(),"Effects")
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)


    }
}
