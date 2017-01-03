package FuProInScala.chapter3

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_1 {

  /*
  /* Exercise 3.1 */
  def exercise_1 (): Unit = {
    val x = List(1, 2, 3, 4, 5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + sum(t)
      case _ => 101
    }
    println(x)
  }
*/
}
