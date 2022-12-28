package ch2

object Q3n4n5Currying extends App {

  def curry[A,B,C](f :  (A,B) => C) : A => (B => C) =
    //we have to return a function that takes an A and returns a function that takes a B and gives C
    (a : A) => (b : B) => f(a,b)

  def uncurry[A,B,C](g : A => (B => C)) : (A,B) => C = (a : A,b : B) => g(a)(b)

 def compose[A,B,C](f : A =>B, g : B => C): A => C = (a:A) =>g(f(a))



  def partial1[A,B,C](a : A, f : (A,B) => C) : B => C = {
    /* doesn't work
    val g = new Function1[A,B=>C]{
      def apply(a : A) : B => C = f(a,_)
    }
    g(a)
    */
    //recognize that we have to return a function that takes a B and gives C
    (b : B) => f(a,b)
  }
}
