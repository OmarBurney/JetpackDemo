package com.android.example.jetpacknavdemo

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Name(
    val first: String,
    val last: String
) : Parcelable

class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aText = view.findViewById<TextView>(R.id.aText)

        aText.setOnClickListener{
            val action = AFragmentDirections.actionAFragmentToBFragment(Name("John", "Smith"))
            findNavController().navigate(action)
        }

    }
}