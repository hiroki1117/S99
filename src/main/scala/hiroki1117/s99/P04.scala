package hiroki1117.s99

import scala.annotation.tailrec

object P04 {
  def length[T](list: List[T]): Int = list match{
    case Nil => 0
    case _ :: tail => length(tail) + 1
  }

  def lengthTailRec[T](list: List[T]): Int = {
    @tailrec
    def tailRec[R](l: List[R], len: Int): Int = l match {
      case Nil => len
      case _ :: tail => tailRec(tail, len+1)
    }
    tailRec(list, 0)
  }
}

/*
def length[T](list: List[T]): Int = list.foldRight(0){(x, acc) => acc + 1}
*/