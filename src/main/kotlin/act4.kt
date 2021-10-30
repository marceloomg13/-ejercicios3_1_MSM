fun main(args: Array<String>) {
    val juan=Act4.Persona("54321456Y")
    juan.incorporarCuenta(0.0,juan)
    juan.incorporarCuenta(700.0,juan)
    juan.cuentasP[0]?.recibirAbonos(1100.0 )
    juan.cuentasP[1]?.realizarCargos(750.0)
    //Act4.isMoroso(juan)
}
class Act4 {
    /*companion object isMoroso {
        fun isMoroso(persona:Persona):Boolean {
            var moroso:Boolean=false
            for(i in 0 until persona.cuentasP.size){
                if(persona.cuentasP[i]>0 or persona.cuentasP[i]==null){

                }
                else{return true}
            }
            return false
        }

    }*/

    class Cuenta(cuenta: String, saldo: Double,titular: Persona){
        val titular:Persona
        var cuenta: String = ""
        var saldo: Double = 0.0
        init{
            this.cuenta = cuenta
            this.saldo = saldo
            this.titular=titular
        }
        fun recibirAbonos(abono:Double) {
            saldo+=abono
            print(saldo)
        }
        fun realizarCargos(cargo:Double) {
            saldo-=cargo
            print(saldo)
        }
        fun ObtenerSaldo():Double{
            return saldo
        }
    }
    class Persona(DNI: String) {
        var DNI: String = ""
        var cuentasP: Array<Cuenta?> = arrayOfNulls(3)

        init {
            this.DNI = DNI
        }

        fun incorporarCuenta(SaldoInicial: Double, titular: Persona): Boolean {
            var i: Int = 0
            try {
                var nuevaCuenta = Cuenta("NuevoNumeroDeCuenta$i", SaldoInicial, titular)
                i++
                for (i in cuentasP.indices) {
                    if (cuentasP[i] == null) {
                        cuentasP[i] = nuevaCuenta
                        break
                    } else {
                        return true
                    }
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }
    }
}