package hiroki1117.s99

object P28 {

  def main(args:Array[String]): Unit = {
    val list = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    println(lsortFreq(list))
  }

  def lsort[A](list: List[List[A]]): List[List[A]] = list.sortBy(_.length)

  def lsortFreq[A](list: List[List[A]]): List[List[A]] = 
    list.foldRight(Nil:List[(Int/*length*/,Int/*count*/,List[List[A]])]){(x, acc) =>
      if(acc.exists{case (len,_,_) => len==x.length}) {
          acc.map{case(len,count,acclist) => if(len==x.length) (len,count+1,x::acclist) else (len,count,acclist)}
      } else {
        (x.length,1,List(x))::acc
      }
    }.sortBy(_._2).flatMap(_._3)
}