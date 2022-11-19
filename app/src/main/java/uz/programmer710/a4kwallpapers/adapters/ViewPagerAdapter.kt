package uz.programmer710.a4kwallpapers.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import uz.programmer710.a4kwallpapers.fragments.TablayoutName
import uz.programmer710.a4kwallpapers.fragments.ViewPagerFragment

class ViewPagerAdapter(fm: FragmentManager, val list:ArrayList<TablayoutName>): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return ViewPagerFragment.newInstance(list[position].name)
    }
}