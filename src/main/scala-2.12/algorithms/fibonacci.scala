package algorithms

object fibonacci {
  def fib(n:Int): Int = {
    @annotation.tailrec
    def loop(togo: Int, current:Int=1, acc:Int=0):Int = {
      if(togo == 1) acc
      else loop(togo-1, acc+current, current)
    }
    loop(n)
  }
}
