package algorithms
import java.lang.System.nanoTime

/**
  * Created by bweigel on 12/4/16.
  */
object profiling {

  def mean(x: Double, y:Double):Double = {
    (x + y)/2
  }

  def timeCode[R](code: => R, t: Long = nanoTime):Double = (code, (nanoTime - t)/1e6)._2

  def timeMe[R](n: Int, f: => R): Double = {
      def loop(togo:Int, acc:List[Double]=Nil): Double ={
        togo match {
          case 1 => (timeCode(f) :: acc).reduceLeft(mean)
          case togo => loop(togo-1, timeCode(f) :: acc)
        }
      }
    loop(n)
  }
}
