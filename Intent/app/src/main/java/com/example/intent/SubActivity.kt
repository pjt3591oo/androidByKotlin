package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if (intent.hasExtra("msg")) {
//            println(intent.hasExtra("msg"))
//            println(intent.hasExtra("msg1"))
            textView3.text = intent.getStringExtra("msg")
        }
    }
}