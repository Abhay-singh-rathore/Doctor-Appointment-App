package com.example.doctorappointment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.doctorappointment.databinding.ActivitySplashBinding

class splashActivity : baseActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            startbtn.setOnClickListener {
                startActivity(Intent(this@splashActivity, MainActivity::class.java))
                finish()
            }
        }

    }
}