package hiroki1117.s99

object P27 {
  def group3[A](list: List[A]): List[List[List[A]]] = {
    permutation(list).map(x => List(x.take(2), x.take(5).drop(2), x.drop(5)))
  }

  def group3_[A](list: List[A]): List[List[List[A]]] = {
    group(List(2,3,4), list)
  }

  def group[A](split: List[Int], list: List[A]): List[List[List[A]]] = {
    val a::b::_ = split
    permutation(list).map(x => List(x.take(a), x.take(a+b).drop(a), x.drop(a+b)))
  }

  private def permutation[A](list: List[A]): List[List[A]] = {
    list match {
      case Nil => Nil
      case h::Nil => List(List(h))
      case l => l.flatMap(e1=> permutation(l.filter(e2=>e2!=e1)).map(e1::_))
    }
  }
}