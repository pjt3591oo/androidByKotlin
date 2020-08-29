package com.example.shared

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
    }

    override fun onDestroy() { // Lifecyle => 액티비티 종료 시점에 호출
        super.onDestroy()

        saveData()
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        et_hello.setText(pref.getString("name", "")) // 첫 번째 값: 키 값, 두 번째 값: 키 값에 데이터가 없으면 디폴트 값
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() // 수정모드

        edit.putString("name", et_hello.text.toString())
        edit.apply() // 저장완료(commit 개념)
    }
}