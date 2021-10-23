package com.hanif.menumakanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val namaMenu = intent.getStringExtra("namaMenu")
        val hargaMenu = intent.getStringExtra("hargaMenu")

        val tvNamaMenu = findViewById<TextView>(R.id.menuNama)
        val tvHargaMenu = findViewById<TextView>(R.id.menuHarga)

        tvNamaMenu.text = namaMenu
        tvHargaMenu.text = hargaMenu
    }
}