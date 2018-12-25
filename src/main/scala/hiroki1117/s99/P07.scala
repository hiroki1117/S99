package hiroki1117.s99

object P07 {
	def flatten(list: List[Any]): List[Any] = list flatMap {
		case l: List[_] => flatten(l)
		case e => List(e)
	}
}