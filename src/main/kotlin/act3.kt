class Tiempo(Hora:String,Minuto:String?="00",Segundo:String?="00") {
    var Hora: String = ""
    var Minuto: String?
    var Segundo: String?

    init {
        this.Hora = Hora
        this.Minuto = Minuto
        this.Segundo=Segundo
    }
}
fun main(args: Array<String>) {
    var tiempo1=Tiempo("12")
    var tiempo2=Tiempo("13","55")
    println(tiempo1.Hora+":"+tiempo1.Minuto+":"+tiempo1.Segundo)
    println(tiempo2.Hora+":"+tiempo2.Minuto+":"+tiempo2.Segundo)
}