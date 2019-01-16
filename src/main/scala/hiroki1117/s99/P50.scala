package hiroki1117.s99

import scala.annotation.tailrec

object P50 {
  def huffman(list: List[(String,Int)]): List[(String,String)] = {
    val leafs = list.map(x=>(x._2, HuffTree(x._1)))
    val tree = generateHuffTree(leafs)
    tree match {
      case Some(t) => code(t).toList.sorted(Ordering.by[(String,String),String](_._1))
      case None => Nil
    }
  }

  @tailrec
  private def generateHuffTree[A](list: List[(Int,HuffTree[A])]): Option[HuffTree[A]] = {
    list.sorted(Ordering.by[(Int,HuffTree[A]),Int](_._1)) match {
      case Nil => None
      case x::Nil => Some(x._2)
      case x::y::tail => generateHuffTree((x._1+y._1, x._2 add y._2) :: tail)
    }
  }

  private def code[A](tree: HuffTree[A], sign:String = ""): HuffTree[(A,String)] = {
    tree match {
      case Node(l,r) => Node(code(l, sign+"0"), code(r, sign+"1"))
      case Leaf(a) => Leaf((a,sign)) 
    }
  }

  private sealed trait HuffTree[+T] {
    def add[TT >: T](other: HuffTree[TT]): HuffTree[TT] = Node(this, other)

    def toList: List[T] = foldLeft(Nil: List[T])((acc, x) => x::acc).reverse
  
    def foldLeft[R](z:R)(f:(R,T)=>R): R = this match {
      case Node(l,r) => r.foldLeft(l.foldLeft(z)(f))(f)
      case Leaf(a) => f(z,a)
    }
  }
  private object HuffTree {
    def apply[T](t:T): HuffTree[T] = Leaf(t)
  }
  private case class Node[+T](left:HuffTree[T], right:HuffTree[T]) extends HuffTree[T]
  private case class Leaf[+T](leaf:T) extends HuffTree[T]
}