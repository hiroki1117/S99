package hiroki1117.s99

import scala.util.Random

object P23 {
  val r = new Random
  def randomSelect[T](num: Int, list: List[T]): List[T] = {
    import P20._
    
    list match {
      case Nil => Nil
      case _ => {
        if(num>0){
          val i = r.nextInt(list.length)
          list(i) :: randomSelect(num-1, removeAt(i, list))
        }else{
          Nil
        }
      }
    }
  }
}