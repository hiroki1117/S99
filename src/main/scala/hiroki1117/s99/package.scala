package hiroki1117.s99

package object s99 {
  implicit class S99Int(val value: Int) {
    import S99Int._

    def isPrime: Boolean = !(value<=1)&&(2 to value-1).forall(value%_!=0)
  }

  object S99Int {
    def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y, x%y)
  }
}