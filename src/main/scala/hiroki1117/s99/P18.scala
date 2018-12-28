package hiroki1117.s99

import scala.annotation.tailrec

object P18 {
  def slice[T](start: Int, end: Int, list: List[T]): List[T] = {
    @tailrec
    def tailRec[T](counter:Int, state: List[T], acc: List[T]): List[T] = {
      state match {
        case Nil => acc
        case x :: tail => {
          if(counter>start && counter<=end){
            tailRec(counter+1, tail, x::acc)
          }else if(counter>end){
            acc
          }else{
            tailRec(counter+1, tail, acc)
          }
        }
      }
    }
    tailRec(1, list, Nil).reverse
  }
}