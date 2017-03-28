
object AnotherRomanNumerals {
case class Pattern(oneValue: String, fiveValue: String, tenValue: String)

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
    }
}
