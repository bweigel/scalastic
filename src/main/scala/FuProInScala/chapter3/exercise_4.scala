package FuProInScala.chapter3

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_4 {
  def drop[A](ls : List[A], n: Int): List[A] = {
    if (n <= 0) ls
    else{
      ls match {
        case Nil => sys.error("Empty List")
        case Cons(_, t) => drop(t, n-1)
      }
    }
  }
}
