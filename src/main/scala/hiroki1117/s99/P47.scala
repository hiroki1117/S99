package hiroki1117.s99

object P47 {
  implicit class S99Boolean(a: Boolean) {
    def and(b:Boolean):Boolean = a && b

    def or(b:Boolean):Boolean = a || b

    def nand(b:Boolean):Boolean = not(a and b)

    def nor(b:Boolean):Boolean = not(a or b)

    def xor(b:Boolean):Boolean = (a and not(b)) or (not(a) and b)

    def impl(b:Boolean):Boolean = not(a) or b

    def equ(b:Boolean):Boolean = a==b
  }
  private def not(a:Boolean):Boolean = !a
}