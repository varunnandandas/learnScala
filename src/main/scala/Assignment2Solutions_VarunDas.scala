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

    /*Assignment#6: Generate and print the first 5 multiples of 3 using a "for" loop.*/
    println("Assignment#6: Generate and print the first 5 multiples of 3 using a \"for\" loop.")
    var mu=0
    for (i<- 1 to 5)    {
      mu=3*i
      println(s"3*$i = $mu")
    }
    println("Assignment#6 ends")


    /*Assignment#7: Print odd numbers from 1 to 15 using a "while" loop*/
    println("Assignment#7: Print odd numbers from 1 to 15 using a \"while\" loop")
    //var num7 = List(1,2,3)
    var ctr7=0
    while(ctr7 <= 15) {
      if (ctr7%2!=0){
        println(ctr7)
      }
      ctr7=ctr7+1
    }
    println("Assignment#7 ends")

    /*Assignment#8: Calculate the factorial of a given number using a "for" loop.*/
    println("Assignment#8:Calculate the factorial of a given number using a \"for\" loop.")
    println("Assignment#8: Enter integer for factorial calculation:")
    var num8= scala.io.StdIn.readInt()
    var res8=1
    for (i<- 1 to num8)    {
      res8=res8*i
    }
    println(s"Amount for factorial calculation of $num8 is $res8")
    println("Assignment#8 ends")

    /*Assignment#9: Print the characters of a string in reverse order using a "for" loop.*/
    println("Assignment#9: Print the characters of a string in reverse order using a \"for\" loop.")
    println("Assignment#9: Enter String:")
    var str9= scala.io.StdIn.readLine()
    var res9=str9.length
    for (i<- str9.length -1 to 0 by -1)    {
      println(str9(i))

    }
    //println(s"Amount for factorial calculation of $num9 is $res9")
    println("Assignment#9 ends")
  }
}
