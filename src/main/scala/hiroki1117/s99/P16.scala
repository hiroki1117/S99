package hiroki1117.s99

object P16 {
  def drop[T](num: Int, list: List[T]): List[T] = {
    var count = 1
    list.flatMap{x =>
      count = count + 1
      if((count-1)%num==0){
          Nil
      } else {
          List(x)
      }
    }
  }
}