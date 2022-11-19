package uz.programmer710.a4kwallpapers.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import uz.programmer710.a4kwallpapers.R
import uz.programmer710.a4kwallpapers.adapters.RvAdapter
import uz.programmer710.a4kwallpapers.databinding.FragmentViewPagerBinding
import uz.programmer710.a4kwallpapers.models.MyImage


private const val ARG_PARAM1 = "param1"

class ViewPagerFragment : Fragment(), RvAdapter.RvClick {

    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }
    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var list:ArrayList<MyImage>
    private lateinit var rvAdapter: RvAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentViewPagerBinding.inflate(layoutInflater)

        list= ArrayList()

        if (param1.toString()=="All"){
            list=MyData.allList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }
        if (param1.toString()=="New"){
            list=MyData.newList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }
        if (param1.toString()=="Animals"){
            list=MyData.animalsList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }
        if (param1.toString()=="Cars"){
            list=MyData.carsList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }
        if (param1.toString()=="City"){
            list=MyData.cityList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }
        if (param1.toString()=="Technology"){
            list=MyData.technologyList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecyclview.adapter=rvAdapter
        }

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            ViewPagerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

    override fun onClick(myImage: MyImage) {
        findNavController().navigate(R.id.clickFonFragment, bundleOf("key" to myImage))
    }
}