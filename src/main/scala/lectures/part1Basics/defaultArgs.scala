package lectures.part1Basics

object defaultArgs extends App{
  def tailrec(n:Int,acc:Int=1):Int=
    if(n<=1)acc
    else tailrec(n-1,n*acc)
  val fac=tailrec(10)
}
