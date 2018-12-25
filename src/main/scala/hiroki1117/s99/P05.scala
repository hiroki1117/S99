package hiroki1117.s99

import scala.annotation.tailrec

object P05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case x :: Nil => List(x)
    case x :: tail => reverse(tail) :+ x
    case _ => sys.error("error")
  }

  def reverseTailRec[T](list: List[T]): List[T] = {
    @tailrec
    def tailRec[R](l: List[R], acc: List[R]): List[R] = l match {
      case Nil => acc
      case h :: tail => tailRec(tail, h :: acc)
    }
    tailRec(list, List())
  }
}

/*
def reverse[T](list: List[T]): List[T] = list.foldLeft(Nil: List[T]){(acc, x) => x :: acc}
*/