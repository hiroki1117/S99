package hiroki1117.s99

object P15 {
  def duplicateN[T](num: Int, list: List[T]): List[T] = list.flatMap(x => List.fill(num)(x))
}