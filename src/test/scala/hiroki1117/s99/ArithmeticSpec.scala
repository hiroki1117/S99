package hiroki1117.s99

import org.scalatest._
import Matchers._

class ArithmeticSpec extends FlatSpec {
  import s99._

  "P31" should "determine whether a given integer number is prime" in {
    7.isPrime should be (true)
  }

  "P32" should "Determine the greatest common divisor of two positive integer numbers" in {
    S99Int.gcd(36, 63) should be (9)
  }

  "P33" should "Determine whether two positive integer numbers are coprime" in {
    35.isCoprimeTo(64) should be (true)
  }
}