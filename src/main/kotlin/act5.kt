class Act5 {
    class Libro(titulo: String, autor: String,numeroPags: Int,calificacion: Int){
        var titulo:String =""
        var autor: String = ""
        var numeroPags: Int = 0
        var calificacion: Int = 0
        init{
            this.titulo = titulo
            this.autor = autor
            this.numeroPags=numeroPags
            this.calificacion=calificacion
        }
    }
    class conjuntoLibro(){
       val libro1 = Libro("Pepe y sus aventuras","Pepe",40,8)
       val libro2 = Libro("Pepe y sus aventuras 2","Pepe",40,6)
       val libro3 = Libro("Pepe se muere","Juan",20,5)
       val libro4 = Libro("Pepe y su funeral","Juan",25,8)
       var Libros:Array<Libro> = arrayOf(libro1,libro2,libro3,libro4)
        fun añadir_libro(libro:Libro){

        }
        fun eliminar_libro(titulo:String){
            for (i in Libros){
                if (i.titulo==titulo){

                }
            }
        }
    }
}
fun main(args: Array<String>) {

}