package FuProInScala

object chapter_2 {
  // Excercise 2.2
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(bs: Array[A]): Boolean = {
      if (bs.isEmpty) true
      if (!ordered(bs(0), bs(1))) false
      else loop(bs.drop(1))
    }

    loop(as)
  }

  // Excerice 2.3
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  def funForCurry[A, B, C](a: A, b: B): C = {
    2
  }

  // Excerice 2.4
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B, c: C) =>
  }
}
