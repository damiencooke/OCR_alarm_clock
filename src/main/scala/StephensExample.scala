
object StephensExample {

  case class RomanNumeralsPattern(baseValue: String, valueFor9: String, valueFor5: String, valueFor4: String)

  private val patternForUnits: RomanNumeralsPattern = RomanNumeralsPattern(baseValue = "I",
    valueFor9 = "IX",
    valueFor5 = "V",
    valueFor4 = "IV")

  private val patternForTens: RomanNumeralsPattern = RomanNumeralsPattern(baseValue = "X",
    valueFor9 = "XC",
    valueFor5 = "L",
    valueFor4 = "XL")

  private val patternForHundreds: RomanNumeralsPattern = RomanNumeralsPattern(baseValue = "C",
    valueFor9 = "CM",
    valueFor5 = "D",
    valueFor4 = "CD")


  private val patternForThousands: RomanNumeralsPattern = RomanNumeralsPattern(baseValue = "M",
    valueFor9 = "MX",
    valueFor5 = "V",
    valueFor4 = "MV")


  val listOfPatterns: List[RomanNumeralsPattern] = List(patternForUnits, patternForTens,
    patternForHundreds, patternForThousands)

//    def convertToRomanNumeral(i: Int): String = {
//
//      listOfPatterns.zip(i.toString.map(_.asDigit).reverse).map(
//        digitAndPattern => convert(digitAndPattern._1, digitAndPattern._2)).reverse.mkString
//
//    }


  def convertToRomanNumeral (number: Int): String ={

    val sequenceOfNumbers = number.toString.map(_.asDigit)

    sequenceOfNumbers.size match {
      case 1 => convertNumber(sequenceOfNumbers.head, pattern = patternForUnits)
      case 2 => convertNumber(sequenceOfNumbers.head, pattern = patternForTens) + convertNumber(sequenceOfNumbers.last, pattern = patternForUnits)
      case 3 => convertNumber(sequenceOfNumbers.head, pattern = patternForHundreds) + convertNumber(sequenceOfNumbers.tail.head, pattern = patternForTens) + convertNumber(sequenceOfNumbers.last, pattern = patternForUnits)
      case 4 => "M"
    }
  }


    private def convertNumber(i: Int, pattern: RomanNumeralsPattern): String = {
      i match {
        case 9 => pattern.valueFor9
        case x if x >= 5 => pattern.valueFor5 + pattern.baseValue * (i - 5)
        case 4 => pattern.valueFor4
        case _ => pattern.baseValue * i
      }
    }

}
