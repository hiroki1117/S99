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

  "P34" should "equals Euler's totient function" in {
    10.totient should be (4)
  }

  "P35" should "Determine the prime factors of a given positive integer" in {
    315.primeFactors should be (List(3,3,5,7))
  }

  "P36" should "Determine the prime factors of a given positive integer (2)" in {
    315.primeFactorMultiplicity should be (List((3,2),(5,1),(7,1)))
  }
}