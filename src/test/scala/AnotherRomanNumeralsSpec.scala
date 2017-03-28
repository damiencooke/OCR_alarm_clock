import org.scalatest.{FlatSpec, Matchers}


class AnotherRomanNumeralsSpec extends FlatSpec with Matchers {


/*
  "Another Roman Numerals" should "return I when given 1" in {

    AnotherRomanNumerals.numeralsConverter(1) shouldBe "I"
  }

  it should "return IV when given 4" in {

    AnotherRomanNumerals.numeralsConverter(4) shouldBe "IV"
  }
  it should "return V when given 5" in {

    AnotherRomanNumerals.numeralsConverter(5) shouldBe "V"
  }
  it should "return VII when given 7" in {

    AnotherRomanNumerals.numeralsConverter(7) shouldBe "VII"
  }
  it should "return IX when given 9" in {

    AnotherRomanNumerals.numeralsConverter(9) shouldBe "IX"
  }
  it should "return X when given 10" in {

    AnotherRomanNumerals.numeralsConverter(10) shouldBe "X"
  }

  it should "return XI when given 40" in {

    AnotherRomanNumerals.numeralsConverter(40) shouldBe "XL"
  }
  it should "return L when given 50" in {

    AnotherRomanNumerals.numeralsConverter(50) shouldBe "L"
  }
  it should "return XL when given 70" in {

    AnotherRomanNumerals.numeralsConverter(70) shouldBe "LXX"
  }
  it should "return LXX when given 90" in {

    AnotherRomanNumerals.numeralsConverter(90) shouldBe "XC"
  }
  it should "return C when given 100" in {

    AnotherRomanNumerals.numeralsConverter(100) shouldBe "C"
  }
  it should "return CD when given 400" in {

    AnotherRomanNumerals.numeralsConverter(400) shouldBe "CD"
  }
  it should "return D when given 500" in {

    AnotherRomanNumerals.numeralsConverter(500) shouldBe "D"
  }
  it should "return DCC when given 700" in {

    AnotherRomanNumerals.numeralsConverter(700) shouldBe "DCC"
  }
  it should "return DCC when given 900" in {

    AnotherRomanNumerals.numeralsConverter(900) shouldBe "CM"
  }
  it should "return M when given 1000" in {

    AnotherRomanNumerals.numeralsConverter(1000) shouldBe "M"
  }

  it should "return CDXCVI when given 496" in {

    AnotherRomanNumerals.numeralsConverter(496) shouldBe "CDXCVI"
  }
*/

  it should "return CDXCVI when given 496" in {


    val range = Range(1, 1000)

    range.foreach(x => AnotherRomanNumerals.numeralsConverter(x) should include (""))


  }

  it should "return CDXCVI when given 496  2" in {


    val range = Range(1, 1000)

    range.foreach(x => AnotherRomanNumerals.numeralsConverter(x) should include (""))


  }

  it should "return CDXCVI when given 496   3" in {


    val range = Range(1, 1000)

    range.foreach(x => AnotherRomanNumerals.numeralsConverter(x) should include (""))


  }


  it should "return CDXCVI when given 496    4" in {


    val range = Range(1, 1000)

    range.foreach(x => AnotherRomanNumerals.numeralsConverter(x) should include (""))


  }

  it should "return CDXCVI when given 496    5" in {


    val range = Range(1, 1000)

    range.foreach(x => AnotherRomanNumerals.numeralsConverter(x) should include (""))


  }


}
