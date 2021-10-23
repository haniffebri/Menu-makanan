package com.hanif.menumakanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)

        val listMenu = listOf(
            Menu(nama = "Lele Fish", harga = "Rp 5000"),
            Menu(nama = "Star Fish", harga = "Rp 15.000"),
        )

        val menusAdapter = MenuAdapter(listMenu)

        rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = menusAdapter
        }
    }
}