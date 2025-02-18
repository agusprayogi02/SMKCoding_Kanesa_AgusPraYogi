package id.agusbro.mobilsport

object MobilData {
    private val MobilNames = arrayOf(
        "Koenigsegg CCXR Trevita",
        "Lamborghini Veneno",
        "Lykan Hypersport",
        "Bugatti Veyron",
        "Ferrari Pininfarina Sergio",
        "Pagani Huayra BC",
        "Ferrari F60 America",
        "Bugatti Chiron",
        "Koenigsegg One:1",
        "Koenigsegg Regera",
        "Mercedes-Benz Maybach",
        "Ferrari LaFerrari FXX K",
        "Aston Martin Vulcan"
    )

    private val SubMobilDetail = arrayOf(
        "Inilah mobil termahal di dunia saat ini. Apabila kita rupiahkan harganya mencapai 64 Miliar Rupiah. Tak hanya termahal, Koenigsegg CCXR Trevita juga menjadi salah satu mobil tercepat di dunia. Pasalnya mobil ini memiliki top speed melebihi 410 km/jam. Kemampuan ini tak lepas dari pemakaian bodi carbon yang membuatnya lebih ringan. Sedangkan untuk mesinnya mengusung mesin dual-supercharged V8 berkapasitas 4.800cc yang bisa menghasilkan tenaga mencapai 1,018 bhp pada 7.000 rpm dan torsi 1080 Nm pada 5.600 rpm.",
        "Mobil termahal di dunia selanjutnya adalah Lamborghini Venono. Desain mobil ini begitu agresif dan terlihat futuristik. Beragam teknologi canggih dimilikinya, dan telah dibekali mesin V12 6.5 Liter yang bisa menghasilkan tenaga sebesar 740 Horsepower dan torsi 507 lg-ft. Kemampuan akselerasinya begitu mengagumkan, karena bisa melaju 0 sampai 60 mph dalam waktu 2.9 detik",
        "Masih ingat Lykan Hypersport ?. Mobil ini menjadi bintang dalam film Fast & Furious 7, karena memiliki desain futuristik yang terlihat bagaikan sebuah mobil dari masa depan. Hypercar buatan Lebanon ini juga memiliki mesin 3.7 Liter (3.746cc) Twin-Turbo F6 yang mampu mengeluarkan tenaga mencapai 780 horsepower dan torsi 960 Nm. Top Speed tertinggi yang bisa diraihnya mencapai 395 km/jam dan bisa berlari dari 0 sampai 100km/jam dalam waktu 2.8 detik.",
        "Daftar mobil termahal di dunia tidak lengkap tanpa adanya mobil Bugatti. Rupanya bukan Bugatti Chiron yang termahal, melainkan Bugatti Veyron yang dimodifikasi oleh rumah modifikasi bernama Mansory. Harganya sangat mahal, karena menggunakan bodi yang terbuat dari serat karbon dan dilengkapi paket spoiler baru serta lampu LED yang telah di upgrade. Mobil ini juga tersedia dalam jumlah terbatas dan mengusung mesin yang mampu mengeluarkan tenaga sebesar 1.200 horsepower.",
        "Mobil ini dibuat oleh rumah desain legendaris asal Italia, yaitu Pininfarina. Pada dasarnya mobil ini merupakan Ferrari 458 Spider, namun telah mengalami berbagai perubahan yang membuatnya memiliki bodi lebih ringan. Mobil termahal di dunia ini juga mengusung mesin V8 4.5 Liter yang mampu mengeluarkan tenaga sebesar 562 Horsepower.",
        "Pagani Huayra BC mengusung mesin V12 yang membuatnya menjadi salah satu mobil termahal di dunia. Mesin berkapasitas 5980cc tersebut mampu mengeluarkan tenaga sebesar 800 bhp dan torsi mencapai 1.100 nm. Kemampuan askelerasinya tidak perlu diragukan lagi, karena bisa melesat dari 0-100 km/jam dalam waktu 2.7 detik. Sedangkan top-speed yang dimilikinya mencapai 370 km/jam. Pagani Huayra BC juga tersedia secara terbatas, karena hanya diproduksi 20 unit.",
        "Ferrari F60 America mengusung mesin V12 6.2 Liter yang mampu mengeluarkan tenaga sebsar 740 horsepower. Mobil ini dibuat untuk merayakan ulang tahun Ferrari ke 60 tahun di Amerika Utara. Otamitis hal ini membuat Ferrari F60 America menjadi salah satu mobil termahal di dunia yang dibanderol mecnaapi 2.5 Juta Dollar. Dibalik mahalnya harga Ferrari F60 America kita akan mendapatkan sebuah mobil yang bisa berlari dari 0-100 km/jam dalam waktu 3.1 detik.",
        "Supercar buatan Bugatti memang layak menjadi mobil termahal di dunia. Setelah era Veyron berakhir, kini muncul Bugatti Chiron yang memiliki mesin lebih bertenaga. Mobil termahal di dunia ini mengusung mesin V16 berkapasitas 8.0 Liter yang mampu menghasilkan tenaga 1.500 horsepower dan torsi 1.180 lb-ft. Kecepatannya dibatasi hingga 261 mbps, dan bisa beraklerasi dari 0-100km/jam dalam waktu 2.5 detik.",
        "Ada makna tersedia dari nama mobil termahal di dunia ini. Koenigsegg sengaja menamainya One:1, karena angka satu mewakali kapasitas mesin 1.340cc yang bisa menghasilkan tenaga sebesar 1.340 horsepower. Koenigsegg One:1 juga memiliki top speed mencapai 273 mbp dan mengusung beragam teknologi mobil Formula 1 serta dirancang dengan bodi yang terbuat dari material serat karbon. Selain itu, tersedia pula rem keramik berventilasi yang menjadi sistem pengereman tercanggih saat ini.",
        "Semua mobil buatan Koenigsegg menjadi mobil termahal di dunia. Nah salah satu yang terbaru adalah Koenigsegg Regera. Hypecar yang satu ini mengusung mesin V8 5.0 Liter yang dilengkapi teknologi Twin Turbo dan baterai 4.5 kwh, sehingga mampu menghasilkan tenaga mencapai 1.500 horsepower. Beragam fitur canggih juga dimilikinya, seperti Electronic Stability Control (KES), Traction Control, dan menggunakan rem depan serta belakang keramik berventilasi.",
        "Dari semua mobil termahal di dunia yang kami sampaikan di atas, rupanya yang termahal adalah Mercedes-Benz Maybach Exelero. Harga mobil ini mencapai 2.1 Juta Dollar atau apabila kita rupiahkan setara 29 Miliar Rupiah. Harganya sangat fantastis, karena Mercedes-Benz menawarkan beragam fasilitas mewah yang dipadukan dengan mesin twin-turbo V12 yang mampu mengeluarkan tenaga sebesar 700 Horsepower.",
        "Ferrari LaFerrari FXX K hanya dibuat sebanyak 40 unit. Mobil termahal di dunia buatan Ferrari ini mengusung mesin 6.3 Liter V12 yang mampu mengeluarkan tenaga maksimal sebesar 1.050 PS dan torsi mencapai 900 Nm. Selain itu, tersedia pula sistem transmisi 7 percepatan yang dilengkapi paddle-shift dual-clutch transmission. Untuk mengimbangi performa mesinnya yang sangat bertenaga, Ferrari merancang mobil ini dengan bodi aerodinamisi yang diklaim memiliki downforce lebih baik. Harga mobil Ferrari ini juga sangat mahal, karena dibanderol 2.7 Juta Dolar atau setara 36 Miliar Rupiah.",
        "Spesifikasi Aston Martin Vulcan mengusung mesin V12 7.0 Liter yang mampu menghasilkan tenaga sebesar 800 horsepower yang dialirkan pada gearbox 6 percepatan. Mobil ini bukanlan mobil jalan raya, sehingga dikhususkan untuk berlari di lintasan balap. Mobil ini diluncurkan pada tahun 2015 dan memiliki rangka yang terbuat dari material alumunium alloy serta bodi dari material carbon fiber. Alhasil bodinya menjadi lebih ringan, karena memiliki bobot seberat 1.350 kg."
    )

    private val details = arrayOf(
        "Inilah mobil termahal di dunia saat ini.",
        "Desain mobil ini begitu agresif dan terlihat futuristik.",
        "memiliki desain futuristik yang terlihat bagaikan sebuah mobil dari masa depan. ",
        "bodi yang terbuat dari serat karbon dan dilengkapi paket spoiler baru",
        "Mobil ini dibuat oleh rumah desain legendaris asal Italia, yaitu Pininfarina.",
        "Mesin berkapasitas 5980cc tersebut mampu mengeluarkan tenaga sebesar 800 bhp",
        "mengusung mesin V12 6.2 Liter yang mampu mengeluarkan tenaga sebsar 740 horsepower. ",
        "Supercar buatan Bugatti memang layak menjadi mobil termahal di dunia. ",
        "Koenigsegg sengaja menamainya One:1, karena angka satu mewakali kapasitas mesin 1.340cc",
        "Hypecar yang satu ini mengusung mesin V8 5.0 Liter yang dilengkapi teknologi Twin Turbo",
        "Mercedes-Benz menawarkan beragam fasilitas mewah yang dipadukan dengan mesin twin-turbo V12",
        "Ferrari ini mengusung mesin 6.3 Liter V12 yang mampu mengeluarkan tenaga maksimal sebesar 1.050 PS",
        "Mobil ini diluncurkan pada tahun 2015 dan memiliki rangka yang terbuat dari material alumunium alloy "
    )

    private val MobilHarga = arrayOf(
        4.8F,
        4.5F,
        3.4F,
        3.4F,
        3F,
        2.6F,
        2.5F,
        2.5F,
        2F,
        2F,
        2.1F,
        2.7F,
        2.3F
    )

    private val MobilImage = intArrayOf(
        R.mipmap.a1,
        R.mipmap.a2,
        R.mipmap.a3,
        R.mipmap.a4,
        R.mipmap.a5,
        R.mipmap.a6,
        R.mipmap.a7,
        R.mipmap.a8,
        R.mipmap.a9,
        R.mipmap.a10,
        R.mipmap.a11,
        R.mipmap.a12,
        R.mipmap.a13
    )

    private val Spek = arrayOf(
        arrayOf("4.800 cc", "1,018 bhp", "410 kmph", "1,080 Nm", "1,456 kg"),
        arrayOf("6.498 cc", "740 bhp", "355 kmph", "690 Nm", "1.490 kg"),
        arrayOf("3.746 cc", "780 bhp", "395 kmph", "960 Nm", "1,380 kg"),
        arrayOf("7.993 cc", "987 bhp", "407 kmph", "900 Nm", "1.888 kg"),
        arrayOf("2.499 cc", "562 bhp", "318 kmph", "540 Nm", "1.535 kg"),
        arrayOf("5.980 cc", "800 bhp", "370 kmph", "1.100 Nm", "1.350 kg"),
        arrayOf("6.262 cc", "740 bhp", "330 kmph", "690 Nm", "1.600 kg"),
        arrayOf("7.993 cc", "1.501 bhp", "420 kmph", "1.600 Nm", "1.995 kg"),
        arrayOf("5.065 cc", "1.341 bhp", "451 kmph", "1.371 Nm", "1.360 kg"),
        arrayOf("1.500 cc", "1.479 bhp", "410 kmph", "1.000 Nm", "1.628 kg"),
        arrayOf("5.980 cc", "700 bhp", "250 kmph", "480 – 1000 Nm", "2.100 kg"),
        arrayOf("6.262 cc", "1035 bhp", "360 kmph", "900 Nm", "1.265 kg"),
        arrayOf("6.999 cc", "800 bhp", "360 kmph", "800 Nm", "1.350 kg")
    )

    val listMobil: ArrayList<MobilItem>
        get() {
            val list = arrayListOf<MobilItem>()
            for (i in MobilNames.indices) {
                val mobil = MobilItem()
                mobil.Name = MobilNames[i]
                mobil.Image = MobilImage[i]
                mobil.Harga = MobilHarga[i]
                mobil.SubName = details[i]
                mobil.Details = SubMobilDetail[i]
                mobil.Spek = Spek[i]
                list.add(mobil)
            }
            return list
        }

}