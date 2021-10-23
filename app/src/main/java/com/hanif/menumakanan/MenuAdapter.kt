package com.hanif.menumakanan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menus: List<Menu>) : RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): MenuHolder {
        return MenuHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false))
    }

    override fun getItemCount(): Int = menus.size

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        val itemViewModel = menus[position]

        holder.tvMenuName.text = itemViewModel.nama
        holder.tvMenuHarga.text = itemViewModel.harga
        holder.btnCard.setOnClickListener {v ->
            val intent = Intent(v.context, DetailActivity::class.java)
            intent.putExtra("namaMenu", itemViewModel.nama)
            intent.putExtra("hargaMenu", itemViewModel.harga)
            v.context.startActivity(intent)
        }
    }

    class MenuHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val tvMenuName: TextView = itemView.findViewById(R.id.txtNama)
        val tvMenuHarga: TextView = itemView.findViewById(R.id.txtHarga)
        val btnCard: LinearLayout = itemView.findViewById(R.id.card_menu)
    }
}
