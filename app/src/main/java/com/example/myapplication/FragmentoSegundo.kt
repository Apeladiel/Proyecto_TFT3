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

        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/9/9a/True_Damage_profileicon.png/revision/latest/smart/width/250/height/250?cb=20191030064641")
            .into(binding.imageViewCredit)


        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
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