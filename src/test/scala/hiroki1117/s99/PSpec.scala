
import org.scalatest._
import Matchers._



class PSpec extends FlatSpec {

	val list = (1 to 20).toList
	
	"P01" should "find the last" in {
		P01.last(list) should be (20)
	}

}