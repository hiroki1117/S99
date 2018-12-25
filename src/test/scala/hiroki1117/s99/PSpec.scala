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

	it should "be List.length with tailRecVer" in {
		P04.lengthTailRec(list) should be (list.length)
	}
}