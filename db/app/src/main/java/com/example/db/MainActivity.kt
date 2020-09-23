package com.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.db.db.AppDatabase
import com.example.db.db.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db:AppDatabase? = AppDatabase.getInstance(this)

        val user: User = User(2, "JeongTae", "Park")
        db?.userDao()?.insertAll(user)

        val data: List<User>? = db?.userDao()?.getAll()
        Log.e("[DB]", data.toString())
    }
}