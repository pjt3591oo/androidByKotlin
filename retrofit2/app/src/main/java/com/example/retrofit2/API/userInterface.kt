package com.example.retrofit2.API

import retrofit2.Call
import retrofit2.http.*

interface UserInterface {

    //    @Headers("")
    @GET("/users")
    fun getUsers(
    ): Call<Users>

    @POST("/user")
    @FormUrlEncoded
    fun addUser(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<UserDetail>
}
