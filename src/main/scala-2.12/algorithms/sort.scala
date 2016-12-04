package algorithms

/**
  * Created by bweigel on 12/4/16.
  */
object sort {

  def bubbleSort(inputList: List[Int]): List[Int] = {

    def bubble (listToBubble:List[Int], acc: List[Int]=Nil): List[Int]={
      listToBubble match {
        case Nil => acc.reverse
        case first :: Nil => (first :: acc).reverse
        case first :: second :: rest if first <= second => bubble(second :: rest, first :: acc)
        case first :: second :: rest if first > second => bubble(first :: rest, second :: acc)
      }
    }

    def loop(listToSort: List[Int]): List[Int] = {
      listToSort match {
        case ls if ls == bubble(ls) => ls
        case ls => loop(bubble(ls))
      }
    }

    loop(inputList)
  }

  def bubbleSort2(inputList: List[Int]): List[Int] = {

    def min(x:Int, y:Int):Int = {
      if(x < y) x
      else y
    }

    def max(x:Int, y:Int):Int = {
      if(x > y) x
      else y
    }

    def bubble (listToBubble:List[Int], acc: List[Int]=Nil): List[Int]={
      listToBubble match {
        case Nil => acc.reverse
        case first :: Nil => (first :: acc).reverse
        case first :: second :: rest => bubble(max(first, second) :: rest, min(first, second) :: acc)
      }
    }

    def loop(listToSort: List[Int]): List[Int] = {
      listToSort match {
        case ls if ls == bubble(ls) => ls
        case ls => loop(bubble(ls))
      }
    }

    loop(inputList)
  }
}