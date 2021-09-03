package com.example.pine.domain

import PhotoEntity
import com.example.pine.entity.Photo

class PhotoMapper {
    private fun convert(photoEntity: PhotoEntity): Photo {
        val description = if (photoEntity.description.isNullOrEmpty()) {
            if (!photoEntity.altDescription.isNullOrEmpty()) {
            photoEntity.altDescription}
            else {
                ""
            }
        } else {
            photoEntity.description
        }
        return Photo(photoEntity.id, description,photoEntity.urls.small,photoEntity.urls.full,photoEntity.likedByUser)
    }

    fun convertList(list : List<PhotoEntity>): List<Photo>{
       return list.map { it -> convert(it) }
    }
}