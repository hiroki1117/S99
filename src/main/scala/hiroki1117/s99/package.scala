package hiroki1117

import scala.collection.mutable.ListBuffer

package object s99 {
  implicit class S99Int(val value: Int) {
    import S99Int._

    def isPrime: Boolean = !(value<=1)&&(2 to value-1).forall(value%_!=0)

    def isCoprimeTo(n: Int): Boolean = if(gcd(value, n)==1) true else false

    //オイラーのトーシェント関数
    def totient: Int = (1 to value-1).filter(gcd(value,_)==1).length

    def primeFactors: List[Int] = {
      val result = ListBuffer.empty[Int]
      var acc = value
      for(i <- 2 to value) {
        while(acc%i==0){
          result += i
          acc = acc/i
        }
      }
      result.toList
    }

    def primeFactors2: List[Int] = {
      def loop(num: Int,plist: Stream[Int], acc: List[Int]): List[Int] = {
        if(num==1) acc
        else {
          plist match {
            case h #:: t => if(num%h==0) loop(num/h, plist, h::acc) else loop(num, t, acc)
          }
        }
      }
      loop(value, primes.map(_.toInt), Nil).reverse
    }

    def primeFactorMultiplicity: List[(Int,Int)] = P10.encode(primeFactors).map(_.swap)

    def totient2: Int = primeFactorMultiplicity.foldLeft(1){(acc, x) => (x._1-1)*Math.pow(x._1, x._2-1).toInt*acc}

    def goldbach: Option[(Int, Int)] = if(value%2==0) primes.map(_.toInt).find(x=>(value-x).isPrime).map(x => (x, value-x)) else None
  }

  object S99Int {
    val primes: Stream[BigInt] = 2 #:: minus(Stream.iterate(3:BigInt)(_+1),joinL(primes.map{p => Stream.iterate(p*p)(_+p)}))

    private def merge[A: Ordering](a:Stream[A], b:Stream[A]):Stream[A] =
        (a.headOption, b.headOption) match {
          case (Some(x),Some(y)) if implicitly[Ordering[A]].lt(x,y) => x #:: merge(a.tail,b)
          case (Some(x),Some(y)) if implicitly[Ordering[A]].gt(x,y) => y #:: merge(a, b.tail)
          case (Some(x),Some(y)) if implicitly[Ordering[A]].equals(x,y) => x #:: merge(a.tail, b.tail)
          case (_, None) => a
          case _ => b
        }

    private def joinL[A: Ordering](xs:Stream[Stream[A]]):Stream[A] = xs.head.head #:: merge(xs.head.tail, joinL(xs.tail))

    private def minus[A : Ordering](a:Stream[A], b:Stream[A]):Stream[A] =
          (a.headOption, b.headOption) match {
            case (Some(x), Some(y)) if implicitly[Ordering[A]].lt(x,y) => x #:: minus(a.tail, b)
            case (Some(x), Some(y)) if implicitly[Ordering[A]].gt(x,y) => minus(a, b.tail)
            case (Some(x), Some(y)) => minus(a.tail, b.tail)
            case _ => a
          }

    def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y, x%y)

    def listPrimesinRange(range: Range): List[Int] = primes.map(_.toInt).dropWhile(_<range.head).takeWhile(_<range.last).toList
  }

  sealed trait Tree[+T]
  case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
    override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
  }
  case object End extends Tree[Nothing] {
    override def toString = "."
  }
  object Node {
    def apply[T](value: T): Node[T] = Node(value, End, End)
  }
}