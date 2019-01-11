package hiroki1117.s99

object P46 {
  def and(a:Boolean, b:Boolean):Boolean = a && b

  def or(a:Boolean, b:Boolean):Boolean = a || b

  def nand(a:Boolean, b:Boolean):Boolean = not (and(a,b))

  def nor(a:Boolean, b:Boolean):Boolean = not (or(a,b))

  def xor(a:Boolean, b:Boolean):Boolean = or(and(a,not(b)), and(not(a),b))

  def impl(a:Boolean, b:Boolean):Boolean = or(not(a),b)

  def equ(a:Boolean, b:Boolean):Boolean = a==b

  def not(a:Boolean):Boolean = !a

  def table2(f:(Boolean,Boolean)=>Boolean): Unit = {
    val lists = for{
      a <- List(true, false)
      b <- List(true, false)
    } yield (a,b,f(a,b))
    println("%-5s %-5s %s".format("A","B","result"))
    lists.foreach(x=>println("%-5s %-5s %-5s".format(x._1, x._2, x._3)))
  }
}