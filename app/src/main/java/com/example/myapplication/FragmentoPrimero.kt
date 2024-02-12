package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentFragmentoPrimeroBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentoPrimero : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    // Binding instance
    private var _binding: FragmentFragmentoPrimeroBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentFragmentoPrimeroBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonCredit.setOnClickListener {
            val userName = binding.editTextUser.text.toString()

            if (userName.isNotEmpty()) {
                val intent = Intent(requireContext(), CreditActivity::class.java)
                intent.putExtra("userName", userName)
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "Por favor, introduce un nombre de usuario", Toast.LENGTH_SHORT).show()
            }
        }

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
            FragmentoPrimero().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
