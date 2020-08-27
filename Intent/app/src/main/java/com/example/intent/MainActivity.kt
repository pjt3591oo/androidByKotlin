package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener {
            // var: 변수, val: 상수
            // 다음화면으로 이동하기 위한 인텐트 객체생성
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("msg", tv_sendMsg.text.toString())

            startActivity(intent) // intent에 저장되어 있는 액티비티로 이동
            finish() // 자기자신 액티비티 파괴한다. 뒤로가기 했을 때 해당 액티비티로 돌아올 수 없음.
        }
    }
}