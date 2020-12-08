package com.example.dolphins.ui.main


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dolphin_pics
import com.example.dolphins.MainActivity

import com.example.dolphins.R
import kotlinx.android.synthetic.main.fragment_intro.*

/**
 * A simple [Fragment] subclass.
 */
class introFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lookatdolphins.setOnClickListener(){
            startActivity(Intent(this.activity,dolphin_pics::class.java))
        }
    }

}
