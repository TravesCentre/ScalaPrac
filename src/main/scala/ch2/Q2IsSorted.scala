package ch2

import scala.annotation.tailrec

object Q2IsSorted extends App {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
    @tailrec
    def loop(n: Int) : Boolean = {
      if(n>=as.size)
        true
      else if (ordered(as(n-1),as(n))){
        loop(n+1)
      }else{
        false
      }
    }
      loop(1)
  }
  val arrIntSorted : Array[Int] = Array(1,1,1,2,3,4,5)
  val arrIntUnsorted : Array[Int] = Array(1,7,3,51,3)

  println(isSorted(arrIntSorted,(x : Int,y : Int) => x<=y))
  println(isSorted(arrIntUnsorted,(x : Int,y : Int) => x<=y))
}
