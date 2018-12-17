//List

object P01 {
  def last[T](list: List[T]): T = list match{  //list.last
    case x :: Nil => x
    case _ :: tail => last(tail)
    case _ => sys.error("error")
  }

  def lastOption[T](list: List[T]): Option[T] = list match {
    case x :: Nil => Some(x)
    case _ :: tail => lastOption(tail)
    case _ => None
  }
}

/*
def last[T](list: List[T]): T = list.tail.foldLeft(list.head){(acc, x) => x}
*/