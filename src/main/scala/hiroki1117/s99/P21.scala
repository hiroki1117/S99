package hiroki1117.s99

object P21 {
  def insertAt[T](ele: T, num: Int, list: List[T]): List[T] = {
    import P17._
    if(num>list.length) {
      list :+ ele
    } else {
      val (ahead, tail) = split(num, list)
      ahead ++ (ele :: tail)
    }
  }
}