package hiroki1117.s99

import org.scalatest._
import Matchers._

class PSpec extends FlatSpec {

	val list = (1 to 20).toList
	
	"P01" should "find the last" in {
		P01.last(list) should be (20)
	}

	"P02" should "find the second element from last" in {
		P02.penultimate(list) should be (19)
	}

	"P03" should "find the Kth element of a list" in {
		P03.nth(5, list) should be (6)
	}

	"P04" should "be List.length" in {
		P04.length(list) should be (list.length)
	}

	it should "be List.length with tailRec" in {
		P04.lengthTailRec(list) should be (list.length)
	}

	"P05" should "be List.reverse" in {
		P05.reverse(list) should be (list.reverse)
	}

	it should "be List.reverse with TailRec" in {
		P05.reverseTailRec(list) should be (list.reverse)
	}

	"P06" should "be true" in {
		P06.isPalindrome(List(1,2,3,3,2,1)) should be (true)
	}

	it should "be false" in {
		P06.isPalindrome(list) should be (false)
	}
}