package com.example.retrofit2.API

data class Users (
    val errorCode: Int,
    val users: List<User>
)

data class UserDetail (
    val errorCode: Int,
    val user: User
)

data class User (
    val id: Int,
    val email: String,
    val password: String,
    val isActive: Boolean
)