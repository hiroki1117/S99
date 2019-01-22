package hiroki1117.s99

import org.scalatest._
import Matchers._

class ArithmeticSpec extends FlatSpec {

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

  it should "turn 315 into List(3,5,37)" in {
    555.primeFactors2 should be (List(3,5,37))
  }

  it should "be List() if 1" in {
    1.primeFactors should be (List())
    1.primeFactors2 should be (List())
  }

  "P36" should "Determine the prime factors of a given positive integer (2)" in {
    315.primeFactorMultiplicity should be (List((3,2),(5,1),(7,1)))
  }

  "P37" should "calculate Euler's totient function2" in {
    10.totient should be (4)
  }

  "P39" should "equald A list of prime numbers of given Range" in {
    S99Int.listPrimesinRange(2 to 12) should be (List(2,3,5,7,11))
  }

  "P40" should "separate into prime pairs if the number is even" in {
    28.goldbach should be (Some((5,23)))
  }

  it should "return None if the number is odd" in {
    33.goldbach should be (None)
  }

}