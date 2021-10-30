class Coche(Color: String, Marca: String, Modelo:String,Caballos:Int,Puertas:Int,Matricula:String) {
    var Color: String = ""
    var Marca: String = ""
    var Modelo: String = ""
    var Matricula: String = ""
    var Caballos: Int = 0
    var Puertas: Int = 0

    init {
        this.Color = Color
        this.Marca = Marca
        this.Caballos=Caballos
        this.Modelo=Modelo
        this.Matricula=Matricula
        this.Puertas=Puertas
    }
}
fun main(args: Array<String>) {
    var Coche1=Coche("rojo","Seat","Leon",400,4,"1715FLY")
    var Coche2=Coche("verde","Seat","ibiza",435,4,"1719FLY")
    println(Coche1.Color)
    Coche1.Color="verde"
    println(Coche1.Color)
    println(Coche2.Matricula)
    Coche2.Matricula="123456kja"
    println(Coche2.Matricula)
}