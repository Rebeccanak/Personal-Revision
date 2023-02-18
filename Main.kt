fun main(){
var text = "Akirachixi"
    println(text[0]+""+text[2]+""+text[3]+ "")
println(getparameters("Rebecca", "24"))
    println(getlength("Rebecca"))
    aboutme("Rebecca Tracy")
    aboutme("Bridget Nakakande")

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
fun text(words: String){
    var text = "Akirachixi"
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun getparameters(name:String, age:String):String{
    var getperameters = "Hi my name is $name and I am $age years old"
    return getperameters
}
//Write a function that takes in a String and returns its length
fun getlength(length:String):Int{
    var getlength = (length.length)
    return getlength
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun aboutme(name: String){
    if(name=="Rebecca Tracy")
    println("Thats me")
    else
        println("That's not me")
}