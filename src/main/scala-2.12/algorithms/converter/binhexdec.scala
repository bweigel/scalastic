package algorithms.converter

import scala.annotation.tailrec
import scala.math.pow

/**
  * Created by bweigel on 12/9/16.
  */
object binhexdec {
  def binToInt(bin: String):Int={
    @tailrec
    def loop(n:Int, acc:Int):Int={
      if(n == bin.length) acc
      else loop(n+1, acc + bin.reverse(n).asDigit * pow(2, n).toInt)
    }
    loop(0, 0)
  }
}
