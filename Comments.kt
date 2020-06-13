
// this is main function
fun main(args:Array<String>) {
    //Enter Name
    print("Enter name:")
    var name= readLine()
    //Enter Age
    print("Enter age:")
    var age:Int= readLine()!!.toInt()
    //Enter Department
    print("Enter department:")
    var dep= readLine()

    //Printing all inputs
    println("#### OUTPUT ####\n")
    println("name:"+ name)
    println("age:"+ age)
    println("department:"+ dep)

}