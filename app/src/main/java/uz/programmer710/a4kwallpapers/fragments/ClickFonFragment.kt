package uz.programmer710.a4kwallpapers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.programmer710.a4kwallpapers.R
import uz.programmer710.a4kwallpapers.databinding.FragmentClickFonBinding
import uz.programmer710.a4kwallpapers.models.MyImage


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ClickFonFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentClickFonBinding
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
    ): View? {

        binding = FragmentClickFonBinding.inflate(layoutInflater)

        val item=arguments?.getSerializable("key") as MyImage
        binding.image.setImageResource(item.image)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ClickFonFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}