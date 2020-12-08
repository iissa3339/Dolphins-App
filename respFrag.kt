package com.example.dolphins.ui.main


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dolphins.MainActivity

import com.example.dolphins.R
import kotlinx.android.synthetic.main.fragment_resp.*

/**
 * A simple [Fragment] subclass.
 */
class respFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resp, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        checkAns.setOnClickListener(){
            blowholeCheck.setTextColor(Color.parseColor("#0000FF"))
            gillsCheck.setTextColor(Color.parseColor("#0000FF"))
            fishCheck.setTextColor(Color.parseColor("#0000FF"))
            mammalCheck.setTextColor(Color.parseColor("#0000FF"))
            if (blowholeCheck.isChecked){
                blowholeCheck.setTextColor(Color.GREEN)
            }
            else if (gillsCheck.isChecked){
                gillsCheck.setTextColor(Color.RED)
            }
            if (mammalCheck.isChecked){
                mammalCheck.setTextColor(Color.GREEN)
            }
            else if (fishCheck.isChecked){
                fishCheck.setTextColor(Color.RED)
            }
        }
        clearAns.setOnClickListener(){
            questionBreathing.clearCheck()
            questionType.clearCheck()
            blowholeCheck.setTextColor(Color.parseColor("#0000FF"))
            gillsCheck.setTextColor(Color.parseColor("#0000FF"))
            fishCheck.setTextColor(Color.parseColor("#0000FF"))
            mammalCheck.setTextColor(Color.parseColor("#0000FF"))
        }
    }

}
