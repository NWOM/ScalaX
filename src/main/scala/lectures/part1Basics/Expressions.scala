package lectures.part1Basics

object Expressions extends App {
  val x=1+2 //EXPRESSIIONS
  println(x)
  println(2+3*4)
  println(1==x)
  println(!(1==x))
  var aVariable=2
  aVariable+=3//works with -=,+=,/=,*=
  //changing a variable  is called side effect
  println(aVariable)
  //Instruction(DO) vs Expressions (VALUE)
  //If expressions
  val aCondition: Boolean=true
  val aCondtionValue=if(aCondition) 5 else 3 //IF EXPRESSION
  println(aCondtionValue)
  var  i=0
  while(i<10){
    println(i)
    i+=1
  }
  //NEVER WRITE THE LOOPS AGAIN
  //EVERYTHING IN SCALA IS EXPRESSION
  val aWeirdValue=(aVariable=3)//Unit==void
  println(aWeirdValue) //()
  //side effects: println(),whiles
  //code blocks
  //the value of  the block is the value of the last expression
  val aCodeBlock={
    val x=2
    val z=x+1
    if(z>2)"Hello" else "No hello"
  }

  /**
   * Expressions Vs Instructions
   * Instructions are executed while expressions are evaluated
   * in scala we will use in terms of expression
   */


}
