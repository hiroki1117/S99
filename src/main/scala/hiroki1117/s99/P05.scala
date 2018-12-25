package hiroki1117.s99

object P05 extends App{
  def reverse[T](list: List[T]): List[T] = list match {
    case x :: Nil => List(x)
    case x :: tail => reverse(tail) :+ x
    case _ => sys.error("error")
  }
}

/*
def reverse[T](list: List[T]): List[T] = list.foldLeft(Nil: List[T]){(acc, x) => x :: acc}
*/