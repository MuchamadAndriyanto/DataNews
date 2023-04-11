package com.example.datanews

import java.io.Serializable

data class ListData(var name : String, var tanggal : String, var penulis : String, var img : Int, var deskripsi : String) :Serializable
