package com.example.bitfit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class Add : Fragment() {
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add,container,false)
        val btn: Button = view.findViewById(R.id.button2)
        val editText : EditText = view.findViewById(R.id.editTextTextPersonName)
        communicator = activity as Communicator
        btn.setOnClickListener{
            communicator.passData(editText.text.toString())
        }
        return view
    }
}