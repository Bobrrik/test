package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.BottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingSheet= BottomSheetBinding.inflate(layoutInflater)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(binding.root)
        setSupportActionBar(binding.mainToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val bottomSheetBehavior = BottomSheetBehavior.from(binding.sheet.bottomSheet)


        binding.button.setOnClickListener {
            bottomSheetBehavior.state=BottomSheetBehavior.STATE_COLLAPSED
        }
        binding.mainAppbarLayout.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
             binding.mainCollapsing.title =verticalOffset.toString()


        }
    }
}