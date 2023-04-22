package com.example.activity4.services

import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("/posts/{id}")
    suspend fun getPost(@Path("id") id: Int): Post

    @GET("/posts")
    suspend fun getPosts(): List<Post>
}
