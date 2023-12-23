package lectures.part1Basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n:Int): Int=
    if(n<=1) 1
    else n*factorial(n-1)

  def anotherfactorial(n:Int):BigInt= {
    def factorialhelper(x:Int,accumulator:BigInt):BigInt=
      if(x<=1) accumulator
      else factorialhelper(x-1,x*accumulator)//TAIL RECURSION=user recursive call as the LAST expresssion
    factorialhelper(n,1)
  }
  /*
  anotherfactorial(10)=factorialhelpper(10,1)
  factorialheler(9,10*1)
  factorialhelper(8,9*10*1)
  factorialhelpper(7,8*9*10*1)....
  ....
  factorialhelpper(2,3*4*.....*10*1)
  factorialhelper(1,1*2*3*4......*10)
  */
  anotherfactorial(5000)

  //WHEN YOU NEED  LOOPS  USE TAIL RECURSION

  /*
    1. Concatenaton of a string n times
    2. IsPrime() tail recurion
    3. Fibanocci tail recursion
   */

   def concatenateTailrec(a:String,n:Int,accumulator:String):String=
     if(n<=0)accumulator
     else concatenateTailrec(
       a,n-1,a+accumulator
     )
   println(concatenateTailrec("hello",6,""))

   def isPrime(n:Int):Boolean={
     @tailrec
     def isPrimetailrec(t:Int,isStillPrime:Boolean):Boolean= {
       if(!isStillPrime) false
       if(t<=1) true
       else isPrimetailrec(t-1,n%t!=0 && isStillPrime )
     }
     isPrimetailrec(n/2,true)

   }

  def fibanocci(a:Int):Int= {
    def finbanoccitailrec(i:Int,last:Int,nextlast:Int):Int=
      if(i>=a) last
      else finbanoccitailrec(i+1,last+nextlast,last)
    if(a<=2) 1
    else finbanoccitailrec(2,1,1)
  }

}
