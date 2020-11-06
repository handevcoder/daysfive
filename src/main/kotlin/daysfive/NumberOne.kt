package daysfive

open class Animal {
    open val umur: Int = 2
    open fun animalState(): String {
        return when {
            umur < 1 -> "Belum siap ditenarkan"
            umur < 5 -> "Siap diterapkan"
            umur > 4 -> "Hewan sudah Tua"
            else -> "Unknown"
        }
    }
}

class Fowel : Animal() {
    override val umur: Int = 2
    override fun animalState(): String {
        return when {
            umur < 1 -> "Belum siap ditenarkan"
            umur >= 1 -> "Siap Diterapkan"
            else -> "UNKNOWN"
        }
    }
}

class Fish() : Animal() {
    override var umur: Int = 0
    fun calculateMass(weight: Int): Int{
        return umur * weight
    }

    fun calculateMass(weight: Int, waterContent: Int): Int{
        return umur * weight - waterContent
    }

}

fun main() {
    val coba = Animal()
    coba.animalState()

    val a = Fowel()
    println(a.animalState())
    val dataMurai = RunApplication.Murai
    dataMurai.setData("murai batu",6,"vertebrata")

    val b = Fish()
    b.umur = 5
    println(b.animalState())
    println("massa ikan ada ${b.calculateMass(10)}")
    println("massa ikan dikurangi volume airnya ${b.calculateMass(10,10)}")
    val dataTengiri = RunApplication.Tengiri
    dataTengiri.setData()
}

class RunApplication : Animal() {
    object Murai{
        fun setData(nama: String, umur: Int, type: String){
            println("Nama = $nama, umur = $umur, type = $type")
        }
    }

    object Tengiri{
        fun setData(nama: String= "tengiri laut", umur:Int=3, type: String="vertebrata"){
            val a = Animal().animalState()
            println("Nama = $nama, umur = $umur, type = $type")
        }
    }
}




