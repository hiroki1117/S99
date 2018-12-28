package hiroki1117.s99

object P17 {
  def split[T](num: Int, list: List[T]): (List[T], List[T]) = {
    var count = 1
    val t = list.foldLeft((Nil, Nil): (List[T], List[T])){ (acc, x) =>
      if(count<=num) {
        count = count + 1
        (x :: acc._1, acc._2)
      } else {
        count = count + 1
        (acc._1, x :: acc._2)
      }
    }
    (t._1.reverse, t._2.reverse)
  }
}