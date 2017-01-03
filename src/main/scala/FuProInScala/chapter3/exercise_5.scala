package FuProInScala.chapter3
import FuProInScala.chapter3.List._
/**
  * Created by bweigel on 12/31/16.
  */
object exercise_5 {
    def dropWhile[A](ls: List[A], f: A => Boolean): List[A] = {
    if (!f(head(ls))) ls
    else {
      ls match {
        case Nil => sys.error("Empty List")
        case Cons(_, t) => dropWhile(t, f)
      }
    }
  }
}
