package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentFragmentoSegundoBinding
import com.squareup.picasso.Picasso

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentoSegundo : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentFragmentoSegundoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFragmentoSegundoBinding.inflate(inflater, container, false)
        val view = binding.root

        Picasso.get().load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fleagueoflegends.fandom.com%2Fes%2Fwiki%2FTrue_Damage&psig=AOvVaw0zltSwPltNyoNgiIXlak6P&ust=1707828560706000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCPjsm6frpYQDFQAAAAAdAAAAABAE")
            .into(binding.imageViewCredit)


        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        // Nullify binding reference to avoid memory leaks
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentoSegundo().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}