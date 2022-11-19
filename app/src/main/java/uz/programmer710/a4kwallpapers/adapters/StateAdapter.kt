package uz.programmer710.a4kwallpapers.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.programmer710.a4kwallpapers.fragments.TablayoutName
import uz.programmer710.a4kwallpapers.fragments.ViewPagerFragment

class StateAdapter (val list:ArrayList<TablayoutName>,fragment: Fragment)
    : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return ViewPagerFragment.newInstance(list[position].name)
    }
}