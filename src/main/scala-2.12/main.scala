import algorithms.getRnd
import algorithms.sort._
import algorithms.profiling._
import algorithms.fibonacci._

object main {

  def main(args: Array[String]): Unit = {

    val a:List[Int] = getRnd.randomInts(1000, 509990)

    /*
    println(timeMe(100, bubbleSort(a)))
    println(timeMe(100, bubbleSort2(a)))
      */
    println(fib(5))
  }
}