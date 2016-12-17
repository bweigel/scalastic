package algorithms

object fibonacci {
  def fib(n: Int): BigInt = {
    @annotation.tailrec
    def loop(togo: Int, nextNumber: BigInt = 1, accumulator: BigInt = 0): BigInt = {
      if(togo == 1) accumulator
      else loop(togo-1, accumulator+nextNumber, nextNumber)
    }
    loop(n)
  }
}
