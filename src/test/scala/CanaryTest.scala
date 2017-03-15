import org.scalatest.{FlatSpec, Matchers}

class CanaryTest extends FlatSpec with Matchers{

 /* it should "return I when given 1" in {

    RomanNumerals.numeralsConverter(1) shouldBe "I"
  }

  it should "return IV when given 4" in {

    RomanNumerals.numeralsConverter(4) shouldBe "IV"
  }
  it should "return V when given 5" in {

    RomanNumerals.numeralsConverter(5) shouldBe "V"
  }
  it should "return VII when given 7" in {

    RomanNumerals.numeralsConverter(7) shouldBe "VII"
  }
  it should "return IX when given 9" in {

    RomanNumerals.numeralsConverter(9) shouldBe "IX"
  }
  it should "return X when given 10" in {

    RomanNumerals.numeralsConverter(10) shouldBe "X"
  }

  it should "return XI when given 40" in {

    RomanNumerals.numeralsConverter(40) shouldBe "XL"
  }
  it should "return L when given 50" in {

    RomanNumerals.numeralsConverter(50) shouldBe "L"
  }
  it should "return XL when given 70" in {

    RomanNumerals.numeralsConverter(70) shouldBe "LXX"
  }
  it should "return LXX when given 90" in {

    RomanNumerals.numeralsConverter(90) shouldBe "XC"
  }
  it should "return C when given 100" in {

    RomanNumerals.numeralsConverter(100) shouldBe "C"
  }
  it should "return CD when given 400" in {

    RomanNumerals.numeralsConverter(400) shouldBe "CD"
  }
  it should "return D when given 500" in {

    RomanNumerals.numeralsConverter(500) shouldBe "D"
  }
  it should "return DCC when given 700" in {

    RomanNumerals.numeralsConverter(700) shouldBe "DCC"
  }
  it should "return DCC when given 900" in {

    RomanNumerals.numeralsConverter(900) shouldBe "CM"
  }
  it should "return M when given 1000" in {

    RomanNumerals.numeralsConverter(1000) shouldBe "M"
  }*/

  it should "return CDXCVI when given 496" in {

    RomanNumerals.numeralsConverter(496) shouldBe "CDXCVI"
  }
}
