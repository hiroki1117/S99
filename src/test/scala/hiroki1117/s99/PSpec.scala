package hiroki1117.s99

import org.scalatest._
import Matchers._

class PSpec extends FlatSpec {

	val list = (1 to 20).toList
	val charList = List('a', 'b', 'c', 'c', 'd')
	val duplicateList = List(1,1,1,2,2,3,4,5,5)

	
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

	"P07" should "flat List" in {
		P07.flatten(List(List(3,3), 6, List(9, List(7, 8)))) should be (List(3,3,6,9,7,8))
	}

	"P08" should "replaced repeated elements to single" in {
		P08.compress(List(1,1,1,2,3,4,5,5,5,1)) should be (List(1,2,3,4,5,1))
	}

	"P09" should "make sublists from duplicates of list elements" in {
		P09.pack(duplicateList) should be (List(List(1,1,1),List(2,2),List(3),List(4),List(5,5)))
	}

	"P10" should "turn duplicates list into tuple (Num, Element)" in {
		P10.encode(duplicateList) should be (List((3,1), (2,2), (1,3), (1,4), (2,5)))
	}

	"P11" should "copy simpliy ellement if it is no duplicates. Only elements with duplicates are transferred as (N,E)" in {
		P11.encodeModified(duplicateList) should be (List((3,1), (2,2), 3, 4, (2,5)))
	}

	"P12" should "decode a run-length encoded list generated as problem P10" in {
		val encodedList = P10.encode(duplicateList)
		P12.decode(encodedList) should be (duplicateList)
	}

	"P13" should "turn duplicates list into tuple (Num, Element)" in {
		P13.encodeDirect(duplicateList) should be (List((3,1), (2,2), (1,3), (1,4), (2,5)))
	}

	"P14" should "duplicate the elements of a list" in {
		P14.duplicate(charList) should be (List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd'))
	}

	"P15" should "duplicate the elements of a list a given number of times" in {
		P15.duplicateN(3, charList) should be (List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'))
	}

	"P16" should "drop every Nth element from a list" in {
		P16.drop(2, charList) should be (List('a', 'c', 'd'))
	}

	"P17" should "split a list into two parts" in {
		val answer = ((1 to 10 toList), (11 to 20 toList))
		P17.split(10, list) should be (answer)
	}

	"P18" should "extract a slice between Ith and Kth from a List" in {
		P18.slice(8, 13, list) should be ((9 to 13).toList)
	}
}