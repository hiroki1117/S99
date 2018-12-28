package hiroki1117.s99

import scala.annotation.tailrec

object P19 {
  //非常に計算量が大きくなる
  @tailrec
  def rotate[T](num:Int, list:List[T]): List[T] = {
    if(num==0)
      list
    else if(num>0)
      rotate(num-1, list.tail :+ list.head)
    else
      rotate(num+1, list.last :: list.init)
  }
}