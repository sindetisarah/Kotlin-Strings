fun main() {
  var x = "My name is"
    var name = "Sarah"
    println(x + " " +  name)
  individual()
  last()
  interpolate()
  compare()
  change()
  trim()
  check()
  shift()
  separate()
  convert()
}
fun individual() {
  var fruit  = "Banana"
  println(fruit[0]) /*output B*/
  println(fruit[2]) /*output a*/
  println(fruit[2])  /* output n*/
  println(fruit[3])
}
fun last() {
  val name ="sara"
  println(name.last())
  println(name.first())
}
fun interpolate() {
  var name = "sindeti"
  var behaviour ="jovial"
   var sentence ="$name and character known is $behaviour"
  println(sentence)
}

fun inter() {
  var name= "saai"
  var behave ="good"
  println("${name} and character is known as ${behave}")
}
fun compare(){
  var a =""
  var b = " "
  if(a.isEmpty()){
    println(true)
  }else
    print(false)
  if(b.isEmpty()){
    println(true)
  }else
    println(false)
}
fun comparison(){
  var name1 ="sarah"
  var name2 ="sindet"

  if(name1==name2){
    println(true)
  }else
    println(false)
}
fun change(){
  var name = "sarah"
println(name.toUpperCase())
  println(name.toLowerCase())
  println(name.capitalize())
}
fun trim(){
  val name  = " sarah sindet"
  println(name.trimEnd());
  println(name.trimStart())
  println(name.trim())

}

fun check(){
  val location ="gigiri"
  println(location.startsWith("g"))
  println(location.endsWith("z"))
}
fun shift(){
  val character ="Sarah is a Kenyan Female Artist"
 val new =character.replace("Artist", "Software Engineer")
  println(new)

}
fun separate(){
  var cars ="tesla, toyota, rangerover,Noah,Corolla"
  var cars1 =cars.split(",")

  println(cars1)
  println(cars1[1])
  println(cars1[3])

}
fun convert(){
  var temp =28.98
  var stringTemp =temp.toString()
  println("My temperature is ${stringTemp}")
  println("My temperature is"+ stringTemp)
  println("My temperature is"  + temp.toString())
}