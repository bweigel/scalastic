package FuProInScala.chapter2

/**
  * Created by bweigel on 12/31/16.
  */
object exercise_3 {
  // Excerice 2.3
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }
}
