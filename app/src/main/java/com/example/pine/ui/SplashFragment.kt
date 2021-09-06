package com.example.pine.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.pine.R
import com.example.pine.ui.main.MainFragment


class SplashFragment : Fragment() {

    private lateinit var handler: Handler


    private val switchFragments = {
        requireActivity().supportFragmentManager.commit {
            replace(R.id.fragment_container_app_activity, MainFragment())
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        handler = Handler(Looper.myLooper()!!).apply {
            postDelayed(
                switchFragments, 1500L
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacks(switchFragments)
    }


}
