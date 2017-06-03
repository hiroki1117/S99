//List

object P04 {
  def length[T](list: List[T]): Int = list match{
    case Nil => 0
    case _ :: tail => length(tail) + 1
  }
}