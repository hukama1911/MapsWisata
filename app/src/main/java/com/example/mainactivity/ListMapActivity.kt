package com.example.mainactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainactivity.Adapter.adapterWisata
import com.example.mainactivity.model.ModelWisata

class ListMapActivity : AppCompatActivity() {
    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_map)

        val menuIcons = listOf(
            ModelWisata(
                R.drawable.masjid,
                "mesjid,",
                "Padang",
                "Mesjid adalah tempat semua kegiatan ibadah bagi para umat muslim",
                -0.9186279569745642, 100.36139488808065
            ),
            ModelWisata(
                R.drawable.puncak,
                "Danau Maninjau",
                "Sumatera Barat",
                "Danau Maninjau (berarti \"pemandangan\" atau \"peninjauan\" dalam bahasa Minangkabau) adalah sebuah danau kaldera di Tanjung Raya, Kabupaten Agam",
                -0.30771782179450397, 100.21563248423236
            ),
            ModelWisata(
                R.drawable.arau,
                "Arauu",
                "Bukittinggi",
                " Harau berarti 'parau' atau bersuara serak. Konon katanya pada zaman dahulu penduduk yang tinggal di atas Bukit Jambu( salah satu bukit di harau) sering terkenan bencana banjir",
                -0.11280194890416399, 100.66976752121366
            ),
            ModelWisata(
                R.drawable.rinjani,
                "Gunung Rinjani",
                "Indonesia",
                "Keindahan Gunung Rinjani sempat terbingkai dalam mata uang pecahan Rp 10.000 yang dikeluarkan Bank Indonesia pada 1998. Potret Gunung Rinjani yang muncul di permukaan danau kawah dikelilingi oleh tebing setinggi ratusan meter",
                -8.410700563292512, 116.45739164907803
            ),
            ModelWisata(
                R.drawable.puncak,
                "Puncak",
                "Sumatera barat",
                "Pagaruyung Palace is the istana of the former Pagaruyung Kingdom, located in Tanjung Emas subdistrict near Batusangkar town",
                -0.46275970073778755, 100.6162629619181


            )

        )

        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterWisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}