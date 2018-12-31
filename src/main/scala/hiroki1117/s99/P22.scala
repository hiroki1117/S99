package hiroki1117.s99

import scala.annotation.tailrec

object P22 {
  def range(from: Int, to: Int): List[Int] = {
    @tailrec
    def tailRec(num: Int, acc: List[Int]): List[Int] = {
      if(num <= to)
        tailRec(num+1, num :: acc)
      else
        acc
    }
    tailRec(from, Nil).reverse
  }
}