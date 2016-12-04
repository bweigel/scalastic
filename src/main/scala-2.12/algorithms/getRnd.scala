package algorithms
import scala.util.Random
/**
  * Created by bweigel on 12/4/16.
  */
object getRnd {
  def randomInts(n:Int, range: Int=100000):List[Int] = Seq.fill(n)(Random.nextInt(range)).toList
}
