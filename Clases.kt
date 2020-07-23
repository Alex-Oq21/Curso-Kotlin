open class Frutas(){
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var numHojas =0
    /*  init{
        this.color = color
        this.sabor = sabor
        this.precio = precio
    }*/
    constructor(color:String, sabor:String, precio:Int):this(){
       
        this.color = color
        this.sabor = sabor
        this.precio = precio
    }
    constructor(color:String, sabor:String, precio:Int, numHojas:Int):this(){
       
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.numHojas = numHojas
    }
     fun descomponerse(){
        print("La fruta se está decomponiendo")
     }
}
class frutasConGrasa():Frutas(){
    var cantidadGrasa:Int =0

    constructor(cantidadGrasa:Int):this(){
        this.cantidadGrasa = cantidadGrasa
    }
    
}

fun main(args: Array<String>){
 var manzana = Frutas("Rojo", "Dulce", 700)
 println(manzana.color)
 //manzana.descomponerse()

 var aguacate = frutasConGrasa(5)
 println("La cantidad de gramos de grasa del aguacate es : " + aguacate.cantidadGrasa)
    aguacate.color = "verde"
    print("Color del aguacate :"+aguacate.color)
}