package hiroki1117.s99

import org.scalatest._
import Matchers._

class LogicSpec extends FlatSpec {
  import P46._

  "P46" should "be true and(true,true)" in {
    and(true,true) should be (true)
  }

  it should "be false or(false,false)" in {
    or(false,false) should be (false)
  }

  it should "be true nand(true,false)" in {
    nand(true,false) should be (true)
  }

  it should "be false nor(true,false)" in {
    nor(true,false) should be (false)
  }

  it should "be true xor(true,false)" in {
    xor(true,false) should be (true)
  }

  it should "be true impl(false,true)" in {
    impl(false,true) should be (true)
  }

  it should "be false equ(true,false)" in {
    equ(true,false) should be (false)
  }

  it should "be false not(true)" in {
    not(true) should be (false)
  }
}