import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by damien on 24/03/17.
  */
class StephensExampleSpec extends FlatSpec with Matchers {

//  "Another Roman Numerals" should "return I when given 1" in {
//
//    StephensExample.convertToRomanNumeral(1) shouldBe "I"
//  }
//
//  it should "return IV when given 4" in {
//
//    StephensExample.convertToRomanNumeral(4) shouldBe "IV"
//  }
//  it should "return V when given 5" in {
//
//    StephensExample.convertToRomanNumeral(5) shouldBe "V"
//  }
//  it should "return VII when given 7" in {
//
//    StephensExample.convertToRomanNumeral(7) shouldBe "VII"
//  }
//  it should "return IX when given 9" in {
//
//    StephensExample.convertToRomanNumeral(9) shouldBe "IX"
//  }
//  it should "return X when given 10" in {
//
//    StephensExample.convertToRomanNumeral(10) shouldBe "X"
//  }
//
//  it should "return XI when given 40" in {
//
//    StephensExample.convertToRomanNumeral(40) shouldBe "XL"
//  }
//  it should "return L when given 50" in {
//
//    StephensExample.convertToRomanNumeral(50) shouldBe "L"
//  }
//  it should "return XL when given 70" in {
//
//    StephensExample.convertToRomanNumeral(70) shouldBe "LXX"
//  }
//  it should "return LXX when given 90" in {
//
//    StephensExample.convertToRomanNumeral(90) shouldBe "XC"
//  }
//  it should "return C when given 100" in {
//
//    StephensExample.convertToRomanNumeral(100) shouldBe "C"
//  }
//  it should "return CD when given 400" in {
//
//    StephensExample.convertToRomanNumeral(400) shouldBe "CD"
//  }
//  it should "return D when given 500" in {
//
//    StephensExample.convertToRomanNumeral(500) shouldBe "D"
//  }
//  it should "return DCC when given 700" in {
//
//    StephensExample.convertToRomanNumeral(700) shouldBe "DCC"
//  }
//  it should "return DCC when given 900" in {
//
//    StephensExample.convertToRomanNumeral(900) shouldBe "CM"
//  }
//  it should "return M when given 1000" in {
//
//    StephensExample.convertToRomanNumeral(1000) shouldBe "M"
//  }
//
//  it should "return CDXCVI when given 496" in {
//
//    StephensExample.convertToRomanNumeral(496) shouldBe "CDXCVI"
//  }

  "kjasbdkhj" should "return CDXCVI when given 496" in {
    def time[R](block: => R): R = {
      val t0 = System.nanoTime()
      val result = block    // call-by-name
      val t1 = System.nanoTime()
      println("Elapsed time: " + (t1 - t0) + "ns")
      result
    }

    val range = Range(1, 1000)

    val result = time(range.foreach(x => StephensExample.convertToRomanNumeral(x)))

    result





  }

  it should "return CDXCVI when given 496  2" in {


    val range = Range(1, 1000)

    range.foreach(x => StephensExample.convertToRomanNumeral(x) should include (""))


  }

  it should "return CDXCVI when given 496   3" in {


    val range = Range(1, 1000)

    range.foreach(x => StephensExample.convertToRomanNumeral(x) should include (""))


  }


  it should "return CDXCVI when given 496    4" in {


    val range = Range(1, 1000)

    range.foreach(x => StephensExample.convertToRomanNumeral(x) should include (""))


  }

  it should "return CDXCVI when given 496    5" in {


    val range = Range(1, 1000)

    range.foreach(x => StephensExample.convertToRomanNumeral(x) should include (""))


  }
}
