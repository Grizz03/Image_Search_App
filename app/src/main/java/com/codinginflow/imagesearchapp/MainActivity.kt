package com.codinginflow.imagesearchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codinginflow.imagesearchapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private val accessKey = "84OanFXwFzt4bChmCYznpPv2Ci5IKC4MyPsZqtSeSW4"

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}