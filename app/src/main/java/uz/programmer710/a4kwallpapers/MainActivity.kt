package uz.programmer710.a4kwallpapers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.programmer710.a4kwallpapers.databinding.ActivityMainBinding
import uz.programmer710.a4kwallpapers.fragments.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyData.allListData()
        MyData.newListData()
        MyData.animalsListData()
        MyData.carsListData()
        MyData.technologyListData()
        MyData.cityListData()

    }
}