package lectures.part1Basics
//CALL  BY NAME VS CALL BY VALUE
object cbn extends App{
  def calledByvalue(x:Long):Unit={
    println("by  value="+x)
    println("by value="+x)
  }
  def calledByname(x: => Long):Unit={
    println("by  value="+x)
    println("by value="+x)
  }

  calledByvalue(System.nanoTime())
  calledByname(System.nanoTime())
  /*
  CALL BY VALUE
    value  is computed before call
    same value being used everywhere
  CALL BY NAME
    expression is passed literally
    expression is evaluated at every use within
   */

}
