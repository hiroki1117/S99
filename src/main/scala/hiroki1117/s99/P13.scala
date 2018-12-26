package hiroki1117.s99

object P13 {
  def encodeDirect[T](list: List[T]): List[(Int,T)] = {
    list.foldRight(Nil: List[(Int, T)]){(x, acc) => 
      acc match {
        case Nil => (1, x) :: Nil
        case h :: tail => if(h._2 == x) (h._1+1, h._2) ::tail
                              else (1, x) :: h :: tail
      }
    }
  }
}