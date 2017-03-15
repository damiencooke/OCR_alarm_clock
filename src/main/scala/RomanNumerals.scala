
object RomanNumerals {

/*case class Pattern(oneValue: String, fiveValue: String, tenValue: String)
val digits1To9 = Pattern(oneValue = "I", fiveValue = "V", tenValue = "X")
val digits10To99 = Pattern(oneValue = "X", fiveValue = "L", tenValue = "C")
val digits100To999 = Pattern(oneValue = "C", fiveValue = "D", tenValue = "M")


  def numeralsConverter (number: Int): String ={

    val sequenceOfNumbers = number.toString.map(_.asDigit)

    sequenceOfNumbers.size match {
      case 1 => convertNumber(sequenceOfNumbers.head, pattern = digits1To9)
      case 2 => convertNumber(sequenceOfNumbers.head, pattern = digits10To99) + convertNumber(sequenceOfNumbers.last, pattern = digits1To9)
      case 3 => convertNumber(sequenceOfNumbers.head, pattern = digits100To999) + convertNumber(sequenceOfNumbers.tail.head, pattern = digits10To99) + convertNumber(sequenceOfNumbers.last, pattern = digits1To9)
      case 4 => "M"
    }
  }

  def convertNumber(digit: Int, pattern: Pattern): String ={

    digit match {
      case 4 => pattern.oneValue + pattern.fiveValue
      case 5 => pattern.fiveValue
      case 9 => pattern.oneValue + pattern.tenValue
      case numberToMatch if numberToMatch > 5  => pattern.fiveValue + pattern.oneValue * (numberToMatch - 5)
      case _ => pattern.oneValue * digit
    }
  }*/

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
