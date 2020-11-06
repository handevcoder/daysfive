package days5

open class Animal(val age: Int) {
    constructor() : this(0)

    open fun animalState(): String {
        return when {
            age < 1 -> "Belum siap diternakkan"
            age in 1..4 -> "Belum siap diternakkan"
            age > 5 -> "Hewan sudah Tua"
            else -> "Tidak diternakan"
        }
    }
}

class Fowl : Animal() {
    override fun animalState(): String {
        return when {
            age < 1 -> "Belum siap diternakkan"
            age >= 1 -> "Siap diternakkan"
            else -> "unknown"
        }
    }
}

class Fish : Animal {
    constructor(age: Int = 3, nama: String = "tengiri", type: String="vertebrata"): super(age)

    fun calculateMass(weight: Int): Int {
        return age * weight
    }
    fun calculateMass(weight: Int, waterContent: Int): Int {
        return age * weight - waterContent
    }
}

class RunApplication : Animal{
    constructor()
    object Murai {
        fun setData(nama: String, umur: Int, type: String) {
            println("Nama = $nama, umur = $umur, type = $type")
        }
    }

    object Tengiri{
        fun setData(nama: String, age: Int, type: String) {
            val a = Animal().animalState()
            println("Nama = $nama, umur = $age, type = $type")
        }
    }
}
fun main() {
    val coba = Animal()
    coba.animalState()

    val a = Fowl()
    println(a.animalState())
    val dataMurai = RunApplication.Murai
    dataMurai.setData("murai batu", 6, "vertebrata")

    val b = Fish()
    println(b.animalState())
    println("massa ikan ada ${b.calculateMass(10)}")
    println("massa ikan dikurangi volume airnya ${b.calculateMass(10,10)}")
    val dataTengiri = RunApplication.Tengiri
    dataTengiri.setData("tengiri", 3, "vertebrata")
}