package algorithms

object fibonacci {
  def fib(n: Int): BigInt = {
    @annotation.tailrec
    def loop(togo: Int, current: BigInt = 1, acc: BigInt = 0): BigInt = {
      if(togo == 1) acc
      else loop(togo-1, acc+current, current)
    }
    loop(n)
  }
}
