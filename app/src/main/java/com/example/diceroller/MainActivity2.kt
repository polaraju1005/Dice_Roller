package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        val startButton: Button = findViewById(R.id.button2)
        startButton.setOnClickListener {
            openNewActivity()
        }
    }
    private fun openNewActivity(){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}



