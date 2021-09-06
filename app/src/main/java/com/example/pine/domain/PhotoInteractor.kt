package com.example.pine.domain

import accesKey
import com.example.pine.data.remote.PhotosApi
import com.example.pine.entity.Photo
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.concurrent.thread

class PhotoInteractor {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.unsplash.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val photosApi = retrofit.create(PhotosApi::class.java)

    interface ImagesCallback {
        fun imagesLoaded(photos: List<Photo>)
    }

    fun getPhotos(callback: ImagesCallback) {
        thread {
            val response = photosApi.getPhotos(1, 20, accesKey).execute()
            val photoMapper = PhotoMapper()
                val photos = photoMapper.convertList(response.body()!!)
            callback.imagesLoaded(photos)
        }
    }


}