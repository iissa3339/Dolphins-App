package com
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.dolphins.R

class dolphin_pics : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dolphin_pics)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
    }
}
