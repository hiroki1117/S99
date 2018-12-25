package hiroki1117.s99

object P09{
  def pack[T](list: List[T]): List[List[T]] = {
    if(list.isEmpty){
      List(List())
    }else{
      val (headList, tailList) = list span {_ == list.head}
      if(tailList == Nil) List(headList)
      else headList :: pack(tailList)
    }
  }
}