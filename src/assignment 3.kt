fun main() {
    var x=school("akirachix")
    intro("Olga",20)
    number()
   describe ("Esther")
    describe("Faith")
}
fun school(name1:String){
    var x=name1
    print(x[0])
    print(x[2])
    println(x[3])
}
fun intro(name2:String,age:Int){
    val sentence="Hi,my name is $name2 and iam $age years old"
    println (sentence)
}
fun number(){
    var me="Olga"
    println(me.length)
}
fun describe(name3:String){
 if (name3=="Esther") {
     println("That's me !")
 }else {
     println("I don't know who that is")
 }


}
