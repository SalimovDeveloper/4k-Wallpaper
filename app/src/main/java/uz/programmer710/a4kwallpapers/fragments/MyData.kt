package uz.programmer710.a4kwallpapers.fragments

import uz.programmer710.a4kwallpapers.R
import uz.programmer710.a4kwallpapers.models.MyImage

object MyData {

    val tab_name = ArrayList<TablayoutName>()

    val allList = ArrayList<MyImage>()
    val newList = ArrayList<MyImage>()
    val animalsList = ArrayList<MyImage>()
    val carsList = ArrayList<MyImage>()
    val technologyList = ArrayList<MyImage>()
    val cityList = ArrayList<MyImage>()

    val likeList = ArrayList<MyImage>()

    fun allData(){

        allListData()
        newListData()
        animalsListData()
        carsListData()
        technologyListData()
        cityListData()

    }

    fun allListData(){



        allList.add(MyImage(R.drawable.new8))
        allList.add(MyImage(R.drawable.new5))
        allList.add(MyImage(R.drawable.new3))


        allList.add(MyImage(R.drawable.animals5))
        allList.add(MyImage(R.drawable.animals4))
        allList.add(MyImage(R.drawable.animals7))


        allList.add(MyImage(R.drawable.tech3))
        allList.add(MyImage(R.drawable.tech6))
        allList.add(MyImage(R.drawable.tech7))


        allList.add(MyImage(R.drawable.cars3))
        allList.add(MyImage(R.drawable.cars9))
        allList.add(MyImage(R.drawable.cars2))


        allList.add(MyImage(R.drawable.city7))
        allList.add(MyImage(R.drawable.city2))
        allList.add(MyImage(R.drawable.city3))

    }

    fun newListData(){

        newList.add(MyImage(R.drawable.new1))
        newList.add(MyImage(R.drawable.new2))
        newList.add(MyImage(R.drawable.new3))
        newList.add(MyImage(R.drawable.new4))
        newList.add(MyImage(R.drawable.new5))
        newList.add(MyImage(R.drawable.new6))
        newList.add(MyImage(R.drawable.new7))
        newList.add(MyImage(R.drawable.new8))
        newList.add(MyImage(R.drawable.new9))
    }

    fun animalsListData(){

        animalsList.add(MyImage(R.drawable.animals1))
        animalsList.add(MyImage(R.drawable.animals2))
        animalsList.add(MyImage(R.drawable.animals3))
        animalsList.add(MyImage(R.drawable.animals4))
        animalsList.add(MyImage(R.drawable.animals5))
        animalsList.add(MyImage(R.drawable.animals6))
        animalsList.add(MyImage(R.drawable.animals7))
        animalsList.add(MyImage(R.drawable.animals8))
        animalsList.add(MyImage(R.drawable.animals9))
        animalsList.add(MyImage(R.drawable.animals10))

    }

    fun carsListData(){

        carsList.add(MyImage(R.drawable.cars1))
        carsList.add(MyImage(R.drawable.cars2))
        carsList.add(MyImage(R.drawable.cars3))
        carsList.add(MyImage(R.drawable.cars4))
        carsList.add(MyImage(R.drawable.cars5))
        carsList.add(MyImage(R.drawable.cars6))
        carsList.add(MyImage(R.drawable.cars7))
        carsList.add(MyImage(R.drawable.cars8))
        carsList.add(MyImage(R.drawable.cars9))
        carsList.add(MyImage(R.drawable.cars10))

    }

    fun technologyListData(){

        technologyList.add(MyImage(R.drawable.tech1))
        technologyList.add(MyImage(R.drawable.tech2))
        technologyList.add(MyImage(R.drawable.tech3))
        technologyList.add(MyImage(R.drawable.tech4))
        technologyList.add(MyImage(R.drawable.tech5))
        technologyList.add(MyImage(R.drawable.tech6))
        technologyList.add(MyImage(R.drawable.tech7))
        technologyList.add(MyImage(R.drawable.tech1))
        technologyList.add(MyImage(R.drawable.tech4))

    }

    fun cityListData(){

        cityList.add(MyImage(R.drawable.city1))
        cityList.add(MyImage(R.drawable.city2))
        cityList.add(MyImage(R.drawable.city3))
        cityList.add(MyImage(R.drawable.city4))
        cityList.add(MyImage(R.drawable.city5))
        cityList.add(MyImage(R.drawable.city6))
        cityList.add(MyImage(R.drawable.city7))
        cityList.add(MyImage(R.drawable.city8))
        cityList.add(MyImage(R.drawable.city9))
        cityList.add(MyImage(R.drawable.city10))

    }

    fun loadTablayout(){

        tab_name.add(TablayoutName("All"))
        tab_name.add(TablayoutName("New"))
        tab_name.add(TablayoutName("Animals"))
        tab_name.add(TablayoutName("Cars"))
        tab_name.add(TablayoutName("Technology"))
        tab_name.add(TablayoutName("City"))

    }
}