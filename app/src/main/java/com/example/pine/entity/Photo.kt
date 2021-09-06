package com.example.pine.entity

data class Photo(
    val id: String,
    val description: String,
    val urlSmall: String,
    val urlBig: String,
    val isLiked: Boolean
) {
}