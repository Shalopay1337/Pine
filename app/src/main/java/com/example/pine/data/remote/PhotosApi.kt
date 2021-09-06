package com.example.pine.data.remote

import PhotoEntity
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotosApi {
    @GET("photos")
    fun getPhotos(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
        @Query("client_id") clientId: String
    ): Call<List<PhotoEntity>>
}