package hiroki1117.s99

object P11 {
  def encodeModified[T](list: List[T]): List[Any] = 
    P10.encode(list) map {t => if(t._1 == 1) t._2 else t}
}