package com.example.smart_health

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smart_health.databinding.ActivityLogginBinding

class LogginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_loggin)
    }
}