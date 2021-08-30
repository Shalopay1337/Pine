package com.example.pine.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

import com.example.pine.R
import java.util.*
import kotlin.concurrent.schedule


class SplashFragment : Fragment() {

    private lateinit var handler: Handler

    private val switchFragments = {
        requireActivity().supportFragmentManager.commit {
            replace(R.id.fragment_container, MainFragment())
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        handler = Handler(Looper.myLooper()!!).apply {
            postDelayed(
                switchFragments, 2000L
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacks(switchFragments)
    }
}
