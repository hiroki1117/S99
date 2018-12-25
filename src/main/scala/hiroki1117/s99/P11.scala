package hiroki1117.s99

object P11 {

	def encodeModified[T](list: List[T]): List[Any] = 
		P10.encode(list) map {t => if(t._1 == 1) t._2 else t}


/*
	def encodeModified[T](list: List[T]): List[Any] = {
		val temp = P10.encode(list)
		temp.foldRight(Nil: List[Any]){(x, acc) =>
			x match{
				case (1, e) => e :: acc
				case _ => _ :: acc
			}
		}
	}
*/
}