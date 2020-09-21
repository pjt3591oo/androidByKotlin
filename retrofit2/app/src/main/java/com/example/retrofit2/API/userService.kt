package com.example.retrofit2.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIService {
    fun userService(): UserInterface = retrofit.create(UserInterface::class.java)

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}