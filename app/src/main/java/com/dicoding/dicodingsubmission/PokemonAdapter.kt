package com.dicoding.dicodingsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.ListViewHolder>() {
    private val listUser: ArrayList<Pokemon> = ArrayList()

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgView: CircleImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val rootlayout: RelativeLayout = itemView.findViewById(R.id.rv_pokemon)
        val rating: TextView = itemView.findViewById(R.id.tv_item_rate)
    }

    fun setData(items: ArrayList<Pokemon>) {
        listUser.clear()
        listUser.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.layout_pokemon,
            parent,
            false
        )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]
        Glide.with(holder.imgView.context)
            .load(user.photo)
            .into(holder.imgView)
        holder.tvName.text = user.name
        holder.rating.text = user.rating.toString()
        holder.rootlayout.setOnClickListener {
            val intent: Intent = Intent(holder.imgView.context, PokemonInfo::class.java)
            intent.putExtra(PokemonInfo.POKEMON, user)
            holder.imgView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listUser.size
    }
}