
object RomanNumeralsExample1 {

  def numeralsConverter(number: Int) : String = {
    toRomanNumerals(number, List(("M", 1000),("CM", 900), ("D", 500), ("CD", 400), ("C", 100), ("XC", 90),
      ("L", 50), ("XL",40), ("X", 10), ("IX", 9), ("V", 5), ("IV", 4), ("I", 1)))
  }

  private def toRomanNumerals(number: Int, listOfRomanNumerals: List[(String, Int)]) : String = listOfRomanNumerals match {
    case Nil => ""
    case matchedRomanNumeral :: completeListOfRomanNumerals => matchedRomanNumeral._1 * (number / matchedRomanNumeral._2) + toRomanNumerals(number % matchedRomanNumeral._2, completeListOfRomanNumerals)
  }







  def numeralsConverterReadable(number: Int) : String = {
    val x =  toRomanNumerals(number, List(("M", 1000),("CM", 900), ("D", 500), ("CD", 400), ("C", 100), ("XC", 90),
      ("L", 50), ("XL",40), ("X", 10), ("IX", 9), ("V", 5), ("IV", 4), ("I", 1)))
    x
  }

  private def toRomanNumeralsReadable(number: Int, listOfRomanNumerals: List[(String, Int)]) : String = listOfRomanNumerals match {
    case Nil => ""
    case matchedRomanNumeral :: completeListOfRomanNumerals => {
      val list = completeListOfRomanNumerals
      val a = matchedRomanNumeral._1 * (number / matchedRomanNumeral._2)
      val b = toRomanNumerals(number % matchedRomanNumeral._2, completeListOfRomanNumerals)
      val c = a + b
      c
    }
  }
}
