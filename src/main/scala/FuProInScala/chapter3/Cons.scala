package FuProInScala.chapter3

/**
  * Created by bweigel on 1/1/17.
  */
sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def head[A](ls: List[A]): A = {
    ls match {
      case Nil => sys.error("Empty List")
      case Cons(h, _) => h
    }
  }

}