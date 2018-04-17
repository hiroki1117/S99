//List

object P01 {
  def last[T](list: List[T]): T = list match{  //list.last
    case x :: Nil => x
    case _ :: tail => println(tail);last(tail)
    case _ => sys.error("error")
  }
}