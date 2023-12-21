package lectures.part1Basics

object Functions extends App {
 def aFunction(a: Int,b: String): String=
   a+ " "+b
 println(aFunction(5,"hello"))
 def aParamterlessfunction(): Int=42
 println(aParamterlessfunction())

 def aRepeativefunction(a: Int, b: Int): Int=
   if(b==1) a
   else a+aRepeativefunction(a,b-1) //recursive
 println(aRepeativefunction(5,3))
 //WHEN YOU NEED LOOPS USE RECURSION
  def afunctionwithsideffect(aString:String): Unit=println(aString)
  def aBigFunction(n: Int):Int={
    def aSmallestFunction(a: Int,b :Int):Int =
      a+b
    aSmallestFunction(n,n-1)
  }
  /*
     1. A greeting function (name,age)=>"Hi my name is xxxxx and i am y yrs old
     2. A factorial function
     3. A fibonacci function

   */
 def funcGreeting(name: String,age : Int): String= {
   val x: String = "hi" + " " + s"my name is ${name}" + age
   x
 }
  println(funcGreeting("john",63))
 def factorialfunc(n: Int): Int={
   if(n==0) 1
   if(n==1) 1
   else n*factorialfunc(n-1)
 }
 println(factorialfunc(6))
 def fibanocci(n:Int): Int={
   if(n<2) n
   else fibanocci(n-1)+fibanocci(n-2)
 }
 println(fibanocci(72))
 def isPrime(n:Int):Boolean={
   def isPrimeuntil(t: Int): Boolean=
     if(t<=1) true
     else n%t!=0 && isPrimeuntil(t-1)
   isPrimeuntil(n/2)
  }

}
