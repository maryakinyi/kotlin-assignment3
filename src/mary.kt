fun main (){
val text="AkiraChix"
    println(text[0])
    println(text[2])
    println(text[3])
    var name="mary"
    var age=21
    println("my name is $name and I am $age years old .")
    glitter()
    that("mary")
    that("Daina")

}
fun index(text:String){
    var text="AkiraChix"
    println(text)

}
fun self(name:String,age:Int){
    var self="my name is $name and I am $age years old ."
    println(self)
}
fun glitter(){
var glitter="resource"
    println(glitter.length)
}
fun that(name:String){
    if (name=="mary"){
            println("that's me!")
            }
    else{
        println("i don't know who that is")
    }


}