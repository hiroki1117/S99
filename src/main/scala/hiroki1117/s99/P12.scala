package hiroki1117.s99

object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = list flatMap {x => List.fill(x._1)(x._2)}
}