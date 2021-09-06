package com.example.pine.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.androidx.FragmentScreen

interface Navigator {
    fun applyCommand(commands: Array<out Command>)
    fun setupFragmentTransaction(
        screen: FragmentScreen,
        fragmentTransaction: FragmentTransaction,
        currentFragment: Fragment?,
        nextFragment: Fragment
    )
}