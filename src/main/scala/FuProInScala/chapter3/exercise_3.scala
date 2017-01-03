package FuProInScala.chapter3

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_3 {
  def setHead[A](ls: List[A], head: A): List[A] = {
    ls match {
      case Nil => Cons(head, Nil)
      case Cons(_, y) => Cons(head, y)
    }
  }
}
