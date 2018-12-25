package hiroki1117.s99

object P09{

	def pack[T](list: List[T]): List[List[T]] = {
		if(list.isEmpty){
			List(List())
		}else{
			val (h, t) = list span {_ == list.head}
			if(t == Nil) List(h)
			else h :: pack(t)
		
		}
	
	}

}