import FuProInScala.chapter_2._
import algorithms.fibonacci._
import algorithms.getRnd
import algorithms.profiling._
import algorithms.converter.binhexdec._

object main {

  def main(args: Array[String]): Unit = {

    val a:List[Int] = getRnd.randomInts(1000, 509990)
    val b:Array[Int] = Array(1,2,3,4,5)
    println(isSorted(b, ordered))


    println(binToDec("000111"))
    /*
    println(timeMe(100, bubbleSort(a)))
    println(timeMe(100, bubbleSort2(a)))
      */
    println(fib(50))
    println(timeMe(100, fib(50)))
    //val x = curry(funForCurry(1, 2))
  }
}