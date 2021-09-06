package com.example.pine.ui

import android.view.View
import androidx.viewpager2.widget.ViewPager2

private const val MIN_SCALE = 0.7f
private const val MIN_ALPHA = 0.67f

class DepthPageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.apply {
            val pageWidth = width
            val pageHeight = height
            val scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position))
            val marginVertical = pageHeight * (1 - scaleFactor) / 2
            val marginHorizontal = pageWidth * (1 - scaleFactor) / 2
            when {
                position < -1 -> {
                    alpha = 0f
                }

                position <= 1 -> {
                    translationX = if (position < 0) {
                        marginHorizontal - marginVertical / 2
                    } else {
                        marginHorizontal + marginVertical / 2
                    }
                    scaleX = scaleFactor
                    scaleY = scaleFactor
                    alpha = (MIN_ALPHA + (scaleFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 - MIN_ALPHA))
                }
                else -> {
                    alpha = 0f
                }
            }
        }
    }
}