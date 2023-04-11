package com.example.datanews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datanews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listData = arrayListOf(
            ListData("5 Orang Tewas Ditembak Pegawai Bank di Kentucky AS","10/4/2023","Rini",R.drawable.satu,"Lima orang tewas dan sedikitnya enam orang lainnya dirawat di rumah sakit akibat penembakan massal yang terjadi di Old National Bank, Kota Louisville, negara bagian Kentucky, Amerika Serikat pada Senin (10/4/2023)."),
            ListData("Anas Urbaningrum Dijadwalkan Bebas Hari Ini dari Lapas Sukamiskin","11/4/2023","Rini",R.drawable.dua,"Anas Urbaningrum Dijadwalkan Bebas Hari Ini dari Lapas Sukamiskin\n" +
                    "Rini | Hukum | 11-04-2023\n" +
                    "\n" +
                    "Anas Urbaningrum Dijadwalkan Bebas Hari Ini dari Lapas Sukamiskin\n" +
                    "Anas Urbaningrum bebas hari ini dari Lembaga Pemasyarakatan (Lapas) Sukamiskin, Bandung, Jawa Barat, Selasa 11 April 2023. (Foto: Instagram/@anasurbaningrum_)\n" +
                    "    \n" +
                    "PARBOABOA, Jakarta - Mantan Ketua Umum Dewan Pimpinan Pusat (DPP) Partai Demokrat, Anas Urbaningrum, terpidana korupsi proyek Hambalang, Anas Urbaningrum akan bebas bersyarat hari ini, Selasa (11/4/2023) dari Lapas Sukamiskin, Kota Bandung.\n" +
                    "\n" +
                    "Kepala Bagian Humas dan Protokol Direktorat Jenderal Pemasyarakatan (Ditjen Pas), Rika Aprianti mengatakan, Anas bebas karena ia mendapatkan program integrasi cuti menjelang bebas."),
            ListData("50 Barcode QRIS Palsu Ditemukan di Masjid Istiqlal Jakarta","11/04/2023","Rini",R.drawable.tiga,"Kejahatan dengan modus pemasangan stiker barcode QRIS palsu pada kotak amal terjadi di Masjid Istiqlal Jakarta Pusat.\n" +
                    "\n" +
                    "Wakil Ketua bidang Penyelenggara Peribadatan Masjid Istiqlal, mengatakan, pihaknya menemukan 50 barcode palsu di dalam masjid."),
            ListData("Revitalisasi Gedung Empat Pasar Horas Terbentur Kelengkapan Berkas","10/04/2023","Putra Purba",R.drawable.empat,"Kepala Dinas Koperasi, Usaha Kecil Menengah dan Perdagangan, Herbet Aruan menyebut bahwa proses revitalisasi gedung empat Pasar Horas Jaya Pematang Siantar, masih terhambat lantaran harus melengkapi berkas administrasi."),
            ListData("3 Calon Klub Potensial Lionel Messi Jika Hengkang dari Paris Saint Germain","08/04/2023","Michael",R.drawable.lima,"Meski PSG telah menawarkan perpanjangan kontrak, namun proses negosiasi masih buntu. Kontrak La Pukgabersama PSG akan habis pada 30 Juni 2023.\n" +
                    "\n" +
                    "Kabar terbaru menyebutkan bahwa Messi kemungkinan akan pergi dari PSG karena hubungannya dengan fans tidak baik-baik saja.")
        )

        var adapterData = DataAdapter(listData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvData.layoutManager = lm
        binding.rvData.adapter = adapterData

    }
}