class Rectangulo(Base: Double, Altura: Double) {
    var Base: Double = 0.0
    var Altura: Double = 0.0

    init {
        this.Base = Base
        this.Altura = Altura
    }
    fun calculaPerimetro():Double{
        return (Base+Altura)*2
    }
    fun calculaArea():Double{
        return Base*Altura
    }
}
fun main(args: Array<String>) {
    var rectangulo1=Rectangulo(20.4,12.3)
    var rectangulo2=Rectangulo(2.4,1.3)
    var rectangulo3=Rectangulo(0.4,0.3)
    var rectangulo4=Rectangulo(14.4,12.2)
    println(rectangulo1.calculaPerimetro())
    println(rectangulo1.calculaArea())
    println(rectangulo2.calculaPerimetro())
    println(rectangulo2.calculaArea())
    println(rectangulo3.calculaPerimetro())
    println(rectangulo3.calculaArea())
    println(rectangulo4.calculaPerimetro())
    println(rectangulo4.calculaArea())
}