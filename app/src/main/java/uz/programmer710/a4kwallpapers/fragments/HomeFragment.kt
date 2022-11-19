package uz.programmer710.a4kwallpapers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.programmer710.a4kwallpapers.R
import uz.programmer710.a4kwallpapers.adapters.StateAdapter
import uz.programmer710.a4kwallpapers.databinding.FragmentHomeBinding
import uz.programmer710.a4kwallpapers.databinding.TablayoutItemBinding

class HomeFragment : Fragment() {
   private lateinit var binding: FragmentHomeBinding
    private lateinit var stateAdapter: StateAdapter
    private val list=ArrayList<TablayoutName>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.add(TablayoutName("All"))
        list.add(TablayoutName("New"))
        list.add(TablayoutName("Animals"))
        list.add(TablayoutName("Technology"))
        list.add(TablayoutName("Cars"))
        list.add(TablayoutName("City"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.navigationLike.setOnClickListener {
            findNavController().navigate(R.id.likeFragment)
        }

        stateAdapter= StateAdapter(list, this)
        binding.myViewPager.adapter=stateAdapter

        binding.menuButton.setOnClickListener {
            binding.drawer.open()
        }

        setTab()
        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.my_menu_home->{
                    Toast.makeText(binding.root.context, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.my_menu_popular->{
                    Toast.makeText(binding.root.context, "Popular", Toast.LENGTH_SHORT).show()
                }
                R.id.my_menu_random->{
                    MyData.allList.shuffle()
                    MyData.animalsList.shuffle()
                    MyData.newList.shuffle()
                    MyData.carsList.shuffle()
                    MyData.technologyList.shuffle()
                    MyData.cityList.shuffle()
                    binding.drawer.close()
                }
                R.id.my_menu_liked->{
                    findNavController().navigate(R.id.likeFragment)
                }
                R.id.my_menu_history->{
                    Toast.makeText(binding.root.context, "History", Toast.LENGTH_SHORT).show()
                }
                R.id.my_menu_history->{
                    Toast.makeText(binding.root.context, "About", Toast.LENGTH_SHORT).show()
                }
            }
            binding.navView.setCheckedItem()
            true
        }

        TabLayoutMediator(binding.myTablayout,binding.myViewPager){tab,position->
            val tabItemView=TablayoutItemBinding.inflate(layoutInflater)

            tabItemView.tabItemTv.text=list[position].name

            tabItemView.tabItemImg.visibility=View.GONE

            tab.customView = tabItemView.root
        }.attach()

        return binding.root
    }

    private fun setTab() {


        binding.myTablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val customView=tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_item_img)?.visibility=View.VISIBLE
                customView?.findViewById<TextView>(R.id.tab_item_tv)?.animate()?.alpha(1f)?.setDuration(300)?.start()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                val customView=tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_item_img)?.visibility=View.GONE
                customView?.findViewById<TextView>(R.id.tab_item_tv)?.animate()?.alpha(.5f)?.setDuration(300)?.start()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

    }
}