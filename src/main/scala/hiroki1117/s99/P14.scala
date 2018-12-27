package hiroki1117.s99

object P14 {
  def duplicate[T](list: List[T]): List[T] = list.flatMap(x => List(x, x))
}