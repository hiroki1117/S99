//List

object P02 {
  def penultimate[T](list: List[T]): T = list match{    //list.init.last
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => sys.error("error")
  }
}

