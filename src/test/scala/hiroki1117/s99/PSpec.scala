
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

}