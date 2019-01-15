package hiroki1117.s99

object P49 {
  def gray(bit:Int):List[String] = {
    val place = "%" + bit + "s"
    (0 until Math.pow(2,bit).toInt).map(x => place.format(toGray(x)).replace(" ","0")).toList
  }

  private def toGray(n:Int): String = (n^(n>>1)).toBinaryString
}