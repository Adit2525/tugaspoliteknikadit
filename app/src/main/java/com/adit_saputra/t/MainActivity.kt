package com.adit_saputra.t

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnM: Button
    private lateinit var btnTK: Button
    private lateinit var btnGP: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnM = findViewById(R.id.btnM)
        btnTK = findViewById(R.id.btnTK)
        btnGP = findViewById(R.id.btnGP)

        btnM.setOnClickListener {
            val intent = Intent(this, MI_Activity::class.java)
            startActivity(intent)
        }
        btnTK.setOnClickListener {
            val intent = Intent(this, TK_Activity::class.java)
            startActivity(intent)
        }
        btnGP.setOnClickListener {
            val intent = Intent(this, GP_Activity::class.java)
            startActivity(intent)
        }
    }
}