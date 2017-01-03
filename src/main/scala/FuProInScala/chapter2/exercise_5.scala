package FuProInScala.chapter2

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_5 {
  // Excerice 2.5
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }
}
