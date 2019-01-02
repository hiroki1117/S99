package hiroki1117.s99

import org.scalatest._
import Matchers._

class ArithmeticSpec extends FlatSpec {
  import s99._

  "P31" should "determine whether a given integer number is prime" in {
    7.isPrime should be (true)
  }
}