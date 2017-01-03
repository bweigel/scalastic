package FuProInScala.chapter3

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_2 {
  def tail[A](ls: List[A]): List[A] = {
    ls match {
      case Nil => sys.error("Empty List!")
      case Cons(_, t) => t
    }
  }
}
