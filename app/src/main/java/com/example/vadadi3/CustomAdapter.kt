package com.example.vadadi3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vadadi3.R

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

   val titles = arrayOf("Tiempo","dinero","uber")
    val details = arrayOf("casa","x","uber","Recomendad")
    val images = arrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,)



    override fun onCreateViewHolder(viewGroup:ViewGroup, i: Int): ViewHolder {
        val v =LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int){
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init{
            itemImage=itemView.findViewById(R.id.item_image)
            itemTitle=itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detail)


        }
    }
}

