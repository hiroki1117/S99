package hiroki1117.s99

object P26 {
  def combinations[A](n:Int, list:List[A]):List[List[A]] = {
    def loop[A](n:Int, acc:List[A], cand:List[A]):List[List[A]] = {
      if(n==1) cand.map(_::acc)
      else
        cand.map(_::acc).zipWithIndex.flatMap(p=>loop(n-1,p._1,cand.drop(p._2)))
    }
    loop(n,Nil,list).filter(x=>x.length==x.distinct.length).map(_.reverse)
  }
}