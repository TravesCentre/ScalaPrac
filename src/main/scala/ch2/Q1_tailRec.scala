package ch2

import scala.annotation.tailrec

object Q1_tailRec extends App {
  def fib(n: Int) : Int = {
    @tailrec
    def accumulator(total : Int, next  : Int, ct : Int) : Int = {
      if(ct==n)
        total
      else
        accumulator(total+next,total,ct+1)

    }
    //n assumed >=1 since it's a natural number
    accumulator(0,1,1)
  }
  val arr: Array[Int] = Array(1,2,3,4,5,6,7,8,9)

  arr.foreach(i => println(fib(i)))
}
