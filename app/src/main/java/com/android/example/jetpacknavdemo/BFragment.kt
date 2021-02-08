package com.android.example.jetpacknavdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class BFragment : Fragment() {

    private val args: BFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bText = view.findViewById<TextView>(R.id.bText)

        val name = args.userName

        Toast.makeText(view.context, name.first + " " + name.last, Toast.LENGTH_SHORT).show()

        bText.setOnClickListener{
            val action = R.id.action_BFragment_to_CFragment
            findNavController().navigate(action)
        }

    }
}