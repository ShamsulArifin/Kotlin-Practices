
fun main(args:Array<String>) {
    print("Enter name:")
    var name= readLine()
    print("Enter age:")
    var age:Int= readLine()!!.toInt()
    print("Enter department:")
    var dep= readLine()


    println("#### OUTPUT ####\n")
    println("name:"+ name)
    println("age:"+ age)
    println("department:"+ dep)

}