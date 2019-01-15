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

  import P47._

  "P47" should "be true and(true,true)" in {
    true and true should be (true)
  }

  it should "be false or(false,false)" in {
    false or false should be (false)
  }

  it should "be true nand(true,false)" in {
    true nand false should be (true)
  }

  it should "be false nor(true,false)" in {
    true nor false should be (false)
  }

  it should "be true xor(true,false)" in {
    true xor false should be (true)
  }

  it should "be true impl(false,true)" in {
    false impl true should be (true)
  }

  it should "be false equ(true,false)" in {
    true equ false should be (false)
  }
}