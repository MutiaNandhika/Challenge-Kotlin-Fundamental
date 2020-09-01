import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    print("Nama : ")
    reader.nextLine()
    print("Kelas : ")
    reader.nextLine()
    print("No Absen : ")
    val inputAbsen: Int = reader.nextInt()
    println("=================================")

    println("Kamu ingin menghitung apa?")
    println("""
        1. Volume Balok
        2. Volume Bola
        3. Batal
    """.trimIndent())

    println("=================================")

    print("Pilihanmu:")
    val Pilihan: Int = reader.nextInt()
    if (Pilihan == 1) {
        println("==========Volume Balok==========");
        print("Masukkan Panjang : ")
        val Panjang: Double = reader.nextDouble()
        print("Masukkan Lebar : ")
        val Lebar: Double = reader.nextDouble()
        print("Masukkan Tinggi : ")
        val Tinggi: Double = reader.nextDouble()

        val v: Double = Panjang * Lebar * Tinggi;
        println("================================");
        print("Volume dari balok adalah : $v");

    }
    else if (Pilihan == 2) {
        println("===========Volume Bola===========");
        print("Masukan jari-jari bola: ");
        var jari: Double? = null
        jari = reader.nextDouble();
        val v = 1.33333 * Math.PI * jari * jari * jari;
        println("================================");
        print("Volume dari bola adalah ")
        System.out.printf("%.2f", v);
        println()
    }

}