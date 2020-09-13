package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Users: ArrayList<User> = ArrayList<User>()
        Users.add(User("멍개1", 28))
        Users.add(User("멍개2", 28))
        Users.add(User("멍개3", 28))
        Users.add(User("멍개4", 28))
        Users.add(User("멍개5", 28))

        val userAdapter: UserAdapter = UserAdapter(Users, this)

        val layoutManager = GridLayoutManager(this, 2)

        rv_test.layoutManager = layoutManager
        rv_test.adapter = userAdapter

        // interval
        val mainHandler = Handler(Looper.getMainLooper())

        mainHandler.post(object : Runnable {
            override fun run() {
                // 데이터 추가
                Users.add(User("멍개5", 28))
                // 데이터 추가 알림
                userAdapter.notifyItemInserted(userAdapter.itemCount)
                // 5초 딜레이
                mainHandler.postDelayed(this, 5000)
            }
        })
    }
}