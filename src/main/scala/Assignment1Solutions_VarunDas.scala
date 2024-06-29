import scala.math._

object Assignment1Solutions_VarunDas {
  /*
  def userinput(args:Array[String]):Unit={
  println("Please enter your name:")
    val name = scala.io.StdIn.readLine()
    println(s"Hello, $name!")
  }
  */

  def main(args:Array[String]):Unit={
    /*Assignment#1: Given number is even and positive*/
    println("Assignment#1: test if Given number is even and positive")
    println("Assignment#1:Please enter integer:")
    var num = scala.io.StdIn.readInt()
    if (num > 0 && num %2==0) {
      println(s"$num is a even positive number")
    } else {
      println(s"$num is a negative or odd or zero number")
    }
    println("Assignment#1 ends")
    /*Assignment#2: Given value is either less than -10 or greater than 10 */
    println("Assignment#2: test if Given value is either less than -10 or greater than 10")
    println("Assignment#2:Please enter +ve or -ve integer:")
    var num2 = scala.io.StdIn.readInt()
    if (num2 > 10) {
      println(s"$num2 is a positive number than 10")
    } else if (num2 <10 ){
      println(s"$num2 is a negative number than 10")
    } else {
      println(s"$num2 is a less than 10 and greater than -10 number")
    }
    println("Assignment#2 ends")

    /*Assignment#3: given number is odd but non-divisible by 3 */
    println("Assignment#3: test if given number is odd but non-divisible by 3 ")
    println("Assignment#3:Please enter +ve integer:")
    var num3 = scala.io.StdIn.readInt()
    if (num3 %2 != 0 && num3 %3!=0) {
      println(s"$num3 is a odd and non-divisible by 3")
    } else  {
      println(s"$num3 is a even or divisible by 3")
    }
    println("Assignment#3 ends")


    /*Assignment#4: given number is divisible by either 4 or 6 */
    println("Assignment#4: test if given number is divisible by either 4 or 6 ")
    println("Assignment#4:Please enter +ve integer:")
    var num4 = scala.io.StdIn.readInt()
    if (num4 %4 == 0 && num4 %6==0) {
      println(s"$num4 is a divisible by 4 or 6")
    } else  {
      println(s"$num4 is a not divisible by 4 or 6")
    }
    println("Assignment#4 ends")

    /*Assignment#5: given number is age
    to check if a person is eligible to vote (age greater than or equal to 18)
     or eligible to drive (age greater than or equal to 16 */
    println("Assignment#5: test if given number is eligible to vote(>= 18) or drive(>=16) ")
    println("Assignment#5: Please enter +ve integer as your age:")
    var num5 = scala.io.StdIn.readInt()
    if (num5>= 18) {
      println(s"$num5 is a age of a person who can vote and drive")
    } else if (num5 >= 16)  {
      println(s"$num5 is a age of a person who can drive only")
    } else {
      println(s"$num5 is the age of a person who is a minor")
    }
    println("Assignment#5 ends")

    /*Assignment#6:  check if a given number is in the range [1, 10] or [20, 30] */
    println("Assignment#6: test if given number is in the range [1, 10] or [20, 30] ")
    println("Assignment#6: Please enter +ve integer:")
    var num6 = scala.io.StdIn.readInt()
    if (num6>= 1 && num6<=10) {
      println(s"$num6 is a number between 1 to 10")
    } else if (num6 >= 20 && num6 <=30)  {
      println(s"$num6 is a number between 20 and 30")
    } else {
      println(s"$num6 is out of range")
    }
    println("Assignment#6 ends")

    /*Assignment#7:   check if a given number is both negative and 0dd */
    println("Assignment#7:  check if a given number is both negative and odd ")
    println("Assignment#7: Please enter -ve integer:")
    var num7 = scala.io.StdIn.readInt()
    if (num7<0 && num7%2!=0) {
      println(s"$num7 is both a negative and odd number")
    }  else {
      println(s"$num7 is either positive or non-odd number")
    }
    println("Assignment#7 ends")

    /*Assignment#8:   check if a person is eligible for a senior citizen discount (age greater than
60) or a student discount (age less than 25) */
    println("Assignment#8:  check if a person is eligible for a senior citizen discount (age greater than 60) or a student discount (age less than 25) ")
    println("Assignment#8: Please enter +ve integer:")
    var num8 = scala.io.StdIn.readInt()
    if (num8>60 ) {
      println(s"$num8 is senior citizen discount eligible")
    }  else if (num8<25) {
      println(s"$num8 is student discount eligible")
    }
    else {
      println(s"$num8 is nor senior citizen or student.")
    }
    println("Assignment#8 ends")

    /*Assignment#9:    check if a given number is divisible by both 5 and 7 */
    println("Assignment#9:   check if a given number is divisible by both 5 and 7 ")
    println("Assignment#9: Please enter +ve integer:")
    var num9 = scala.io.StdIn.readInt()
    if (num9%5==0 && num9%7==0 ) {
      println(s"$num9 is divisible by both 5 and 7")
    }
    else {
      println(s"$num9 is not divisible by both 5 and 7")
    }
    println("Assignment#9 ends")

    /*Assignment#10:    check if a given number is either non-negative or even */
    println("Assignment#10:   check if a given number is either non-negative or even ")
    println("Assignment#10: Please enter +ve or -ve integer:")
    var num10 = scala.io.StdIn.readInt()
    if (num10%2==0 && num10>0 ) {
      println(s"$num10 is non-negative and is even")
    } else if (num10%2==0 && num10<0 ) {
      println(s"$num10 is negative and is even")
    } else {
      println(s"$num10 is positive or odd or zero")
    }
    println("Assignment#10 ends")

    /*Assignment#11:     check if a given number is both a prime number and an odd number*/
    println("Assignment#11:    check if a given number is both a prime number and an odd number ")
    println("Assignment#11: Please enter +ve integer:")
    var num11 = scala.io.StdIn.readInt()
    var result = 0
    if (num11 <=1) {
      //println(s"$num11 is not prime")
      result = 0
    }
    for (i<- 2 to ((pow(num11,0.5)).toInt + 1)){
      if (num11 % i == 0){
        //println(s"$num11 is not prime")
        result = 0
      } else {
        //println(s"$num11 is prime")
        result = 1
      }
    }
    if (result == 1){
      println(s"$num11 is prime")
    }  else{
      println(s"$num11 is not prime")
    }

    println("Assignment#11 ends")
    /*var num =1
    for (i<- 1 to 5){
      num = 1
      for(j<- 1 to i){
        print(num+ " ")
        num=num+1
      }
      println()
    }
*/

  }
}
