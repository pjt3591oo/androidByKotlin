package com.example.retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit2.API.APIService
import com.example.retrofit2.API.UserDetail
import com.example.retrofit2.API.Users
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        APIService.userService().getUsers().enqueue(object: Callback<Users> {
//            override fun onFailure(call: Call<Users>, t: Throwable) {
//                Log.e("[API] error", t.toString())
//            }
//
//            override fun onResponse(call: Call<Users>, res: Response<Users>) {
//                Log.e("[API] success", res.toString())
//                val resData: Users? = res.body()
//
//                Log.e("[API] body", resData.toString())
//            }
//        })

        APIService.userService().addUser("test123@test123.com", "test123").enqueue(object: Callback<UserDetail> {
            override fun onFailure(call: Call<UserDetail>, t: Throwable) {
                Log.e("[API] error", t.toString())
            }

            override fun onResponse(call: Call<UserDetail>, res: Response<UserDetail>) {
                Log.e("[API] success", res.toString())
                val resData: UserDetail? = res.body()

                Log.e("[API] body", resData.toString())
            }
        })

        Log.e("async test", "async test")
    }
}