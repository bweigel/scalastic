import System.nanoTime

import algorithms.getRnd
import algorithms.sort._
import algorithms.profiling._


object main {

  def main(args: Array[String]) = {

    val a:List[Int] = getRnd.randomInts(1000, 509990)

    println(timeMe(100, bubbleSort(a)))
    println(timeMe(100, bubbleSort2(a)))

  }
}