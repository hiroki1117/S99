//List

object P03 {
  def nth[T](n: Int, list: List[T]): T = list match {  //list(n-1)
    case x :: _ if n == 0 => x
    case x :: tail if n > 0 => nth(n-1, tail)
    case _ => sys.error("error")
  }
}