

object P10 {
	def encode[T](list: List[T]): List[(Int, T)] = {
		val packed = P09.pack(list)
		packed.foldRight(Nil: List[(Int, T)]){(x, acc) =>
			(x.length, x.head) :: acc
		}
	}

}