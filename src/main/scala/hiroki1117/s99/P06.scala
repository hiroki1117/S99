package hiroki1117.s99

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
  	import P05._
    list == reverse(list)
  }
}