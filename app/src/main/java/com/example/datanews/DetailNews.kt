package com.example.datanews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datanews.databinding.ActivityDetailNewsBinding

class DetailNews : AppCompatActivity() {

    lateinit var binding : ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDetail = intent.getSerializableExtra("detailNews") as ListData
        binding.detailImg.setImageResource(getDetail.img)
        binding.detailJudul.text = getDetail.name
        binding.detailTanggal.text = getDetail.tanggal
        binding.detailPenulis.text = getDetail.penulis
        binding.detailDeskripsi.text = getDetail.deskripsi
    }
}