object Assignment2Solutions_VarunDas {
  def main(args:Array[String]):Unit= {
    /*Assignment#1: Print numbers from 1 to 5 using a "for" loop*/
    println("Assignment#1: Print numbers from 1 to 5 using a \"for\" loop")
    var num1 =1
    for (i<- 1 to 5) {
      println(i + " ")
    }
    println("Assignment#1 ends")

    /*Assignment#2: Print even numbers from 2 to 10 using a "while" loop*/
    println("Assignment#2: Print even numbers from 2 to 10 using a \"while\" loop")
    var num2 = 1
    while (num2 <11){
      if (num2%2==0){
        println(num2)
      }
      num2=num2+1
    }
    println("Assignment#2 ends")

    /*Assignment#3: Calculate the sum of all numbers from 1 to 50 using a "for" loop.*/
    println("Assignment#3: Calculate the sum of all numbers from 1 to 50 using a \"for\" loop ")
    var num3 = 1

    for (i<- 1 to 50)    {
      num3=num3+i
    }
    println(s"Sum of all numbers from 1 to 50 is $num3")
    println("Assignment#3 ends")


    /*Assignment#4: Print the square of numbers from 1 to 5 using a "for" loop.*/
    println("Assignment#4: Print the square of numbers from 1 to 5 using a \"for\" loop.")
    var num4 = 1
    var sq=0
    for (i<- 1 to 5)    {
      sq=i*i
      println(s"Square of $i is $sq")
    }
    println("Assignment#4 ends")


    /*Assignment#5: Print the reverse of a given list using a "while" loop.*/
    println("Assignment#5: Print the reverse of a given list using a \"while\" loop..")
    var num5 = List(1,2,3)
    var ctr=num5.length-1
    while(ctr> -1) {
      //println(s"Content of element at position $ctr is $num5($ctr)")
      println(num5(ctr))
      ctr=ctr-1
    }
    println("Assignment#5 ends")


  }
}
