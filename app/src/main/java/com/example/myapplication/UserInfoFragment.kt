package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentUserInfoBinding
import com.squareup.picasso.Picasso

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class UserInfoFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentUserInfoBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)
        val view = binding.root

        val userName = LoginFragment.userName

        binding.textViewName.text = userName

        val imageUrl = "https://play-lh.googleusercontent.com/uJM2tbls8q1eNjHN-MYWBAo5ckmNgHXTFnGSUWSkJyEr40H-WFgka0tvFiTFNG4bOJi2"
        Picasso.get().load(imageUrl).into(binding.imgDecoration)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            UserInfoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}