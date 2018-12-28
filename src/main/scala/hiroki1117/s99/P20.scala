package hiroki1117.s99

object P20 {
  def removeAt[T](num: Int, list: List[T]):List[T] = list.zipWithIndex.filter(_._2!=num).map(_._1)
}