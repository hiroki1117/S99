package hiroki1117.s99

package object s99 {
  implicit class S99Int(val value: Int) {
    import S99Int._

    def isPrime: Boolean = !(value<=1)&&(2 to value-1).forall(value%_!=0)

    def isCoprimeTo(n: Int): Boolean = if(gcd(value, n)==1) true else false

    //オイラーのトーシェント関数
    def totient: Int = (1 to value-1).filter(gcd(value,_)==1).length
  }

  object S99Int {
    def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y, x%y)
  }
}