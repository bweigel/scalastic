import FuProInScala.chapter_2._
import algorithms.fibonacci._
import algorithms.getRnd
import algorithms.profiling._

object main {

  def main(args: Array[String]): Unit = {

    val a:List[Int] = getRnd.randomInts(1000, 509990)

    /*
    println(timeMe(100, bubbleSort(a)))
    println(timeMe(100, bubbleSort2(a)))
      */
    println(fib(50))
    println(timeMe(100, fib(50)))
    val x = curry(funForCurry(1, 2))
  }
}