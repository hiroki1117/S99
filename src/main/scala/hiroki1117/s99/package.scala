package hiroki1117.s99

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

    def primeFactorMultiplicity: List[(Int,Int)] = P10.encode(primeFactors).map(_.swap)

    def totient2: Int = primeFactorMultiplicity.foldLeft(1){(acc, x) => (x._1-1)*Math.pow(x._1, x._2-1).toInt*acc}
  }

  object S99Int {
    def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y, x%y)
  }
}