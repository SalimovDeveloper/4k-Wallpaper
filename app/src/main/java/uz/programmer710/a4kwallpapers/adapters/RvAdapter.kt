package uz.programmer710.a4kwallpapers.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.programmer710.a4kwallpapers.R
import uz.programmer710.a4kwallpapers.databinding.RvItemBinding
import uz.programmer710.a4kwallpapers.models.MyImage

class RvAdapter(val list:ArrayList<MyImage>, val rvClick: RvClick): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val rvItemBinding: RvItemBinding): RecyclerView.ViewHolder(rvItemBinding.root){
        fun onBind(myImage: MyImage){

            val animation = AnimationUtils.loadAnimation(rvItemBinding.root.context, R.anim.rv_anim)
            rvItemBinding.root.startAnimation(animation)

            rvItemBinding.image.setImageResource(myImage.image)
            rvItemBinding.image.setOnClickListener {
                rvClick.onClick(myImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface RvClick{
        fun onClick(myImage: MyImage)
    }
}