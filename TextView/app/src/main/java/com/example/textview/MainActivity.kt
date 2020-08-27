package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// 화면 단위를 액티비티라고 부름.
class MainActivity : AppCompatActivity() {
    // 앱이 최초로 실행됬을 때 수행
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결

        btn_getText.setOnClickListener {
            var title = et_id.text.toString()
            tv_title.setText(title)
        }
//        tv_title.setText("잘생긴 멍개")
    }
}