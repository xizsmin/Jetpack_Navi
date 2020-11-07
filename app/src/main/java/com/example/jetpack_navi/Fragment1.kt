package com.example.jetpack_navi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class Fragment1: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_1, container, false)
        view.findViewById<Button>(R.id.button_fragment1_to_fragment2).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment2)
        }
        view.findViewById<Button>(R.id.button_fragment1_to_fragment3).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment3)
        }
        return view
    }
}