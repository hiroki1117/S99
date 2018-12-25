package hiroki1117.s99


object P08 {

	def compress[T](list: List[T]): List[T] = {
		list.foldRight(Nil: List[T]){(x, acc) =>
			acc match {
				case y :: ys if y == x => y :: ys
				case c => x :: c
			}
		}
	}

}