package com.example.myapplication
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.myapplication.databinding.FragmentDetailItemBinding

private const val ARG_URL = "url"

class DetailItemFragment : Fragment() {
    private var url: String? = null

    private var _binding: FragmentDetailItemBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            url = it.getString(ARG_URL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailItemBinding.inflate(inflater, container, false)
        val view = binding.root

        // Carga la URL en el WebView
        binding.webView.loadUrl("https://tftactics.gg/tierlist/team-comps")

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(url: String) =
            DetailItemFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_URL, url)
                }
            }
    }
}
