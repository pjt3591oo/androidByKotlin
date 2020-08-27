package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = true
        btn_toast.setOnClickListener {
            if (a) {
                a = false
                iv_profile.setImageResource(R.drawable.robot1)
            } else {
                a = true
                iv_profile.setImageResource(R.drawable.robot)
            }

            Toast.makeText(this@MainActivity, "이미지가 바뀌었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}