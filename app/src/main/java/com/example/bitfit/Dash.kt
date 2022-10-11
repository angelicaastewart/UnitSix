package com.example.bitfit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Dash : Fragment() {
    var output : String? = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dash, container, false)
        val textView : TextView = view.findViewById(R.id.textView2)
        output =  arguments?.getString("message")
        textView.text = output
        return view
    }
}