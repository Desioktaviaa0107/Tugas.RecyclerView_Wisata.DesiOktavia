package com.tugas.recyclerview_wisatadesioktavia

object DataWisata {
    private val judulwisata = arrayOf(
        "Pulau Komodo",
        "Trio Gill",
        "Raja Ampat",
        "Danau Sentani",
        "Taman Laut Bunekan"
    )

    private val detailWisata = arrayOf(
        "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain disekitar Kepulauan Nusa Tenggara.",
        "Gili Lombok Trio Gili merupakan pulau cantik yang ada di Lombok. Ketiga pulau tersebut antara lain Gill Trawangan, Gili Meno dan Gili Air.",
        "Raja Ampat menjadi piradona baru di dunia pariwisata Indonesia, Pesona tempat wisata di Indonesia ini mulai banyak dikenal baik oleh wisatawan maupun mancanegara",
        "Danau Sentani disebut sebagai danau terbesar dengan di papua. Tak mengherankan memang, karena danau ini memiliki luas sekitar 9.360 hektar",
        "Taman Laut Bunaken menjadi salah satu tempat wisata di Indonesia yang lagi-lagi ditetapkan UNESCO sebagai situs warisan dunia, tepatnya pada tahun 2006."
    )

    private val imgWisata = intArrayOf(
        R.drawable.pulaukomodo,
        R.drawable.gililombok,
        R.drawable.rajaampat,
        R.drawable.danausentasi,
        R.drawable.tamanlautbunaken
    )

    val listData: ArrayList<Wisata>
    get() {
        val list = arrayListOf<Wisata>()
        for (position in judulwisata.indices){
            val wisata = Wisata()
            wisata.wisata = judulwisata[position]
            wisata.detail = detailWisata[position]
            wisata.img = imgWisata[position]
            list.add(wisata)
        }
        return list

    }
}
