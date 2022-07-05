package com.kotlin.toko_sumber_jaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ivAjukan = findViewById<LinearLayout>(R.id.ivAjukan)
        val ivRiwayat = findViewById<LinearLayout>(R.id.ivRiwayat)
        ivAjukan.setOnClickListener {
            Toast.makeText(this,"Page Ajukan",Toast.LENGTH_SHORT).show()
        }
        ivRiwayat.setOnClickListener {
            Toast.makeText(this,"Page Riwayat",Toast.LENGTH_SHORT).show()
        }
    }
}