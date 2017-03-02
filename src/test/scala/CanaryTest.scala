import WhoWonCalculator.{Board, PokerCard, PokerHand}
import org.scalatest.{FlatSpec, Matchers}

class CanaryTest extends FlatSpec with Matchers{

//  "The who won calculator" should "make AD 10C beat 2C 8S when the board is 6S JD 7C QH 3H" in {
//
//    val result = WhoWonCalculator.winningHand(handOne = List(("A", "D"),("10", "C")), handTwo = List(("2", "C"),("8", "S")),
//                                              board = List(("6", "S"), ("J", "D"), ("7", "C"), ("Q", "H"), ("3", "H")))
//
//    result shouldBe "hand one wins"
//
//  }
//
//  it should "make 2C 8S beat AD 10C when the board is 6S JD 7C QH 3H" in {
//
//    val result = WhoWonCalculator.winningHand(handOne = List(("2", "C"),("8", "S")), handTwo = List(("A", "D"),("10", "C")),
//      board = List(("6", "S"), ("J", "D"), ("7", "C"), ("Q", "H"), ("3", "H")))
//
//    result shouldBe "hand two wins"
//
//  }
//
//  it should "make 2C 8S draw to 2D 8H when the board is 6S JD 7C QH 3H" in {
//
//    val result = WhoWonCalculator.winningHand(handOne = List(("2", "C"),("8", "S")), handTwo = List(("2", "D"),("8", "H")),
//      board = List(("6", "S"), ("J", "D"), ("7", "C"), ("Q", "H"), ("3", "H")))
//
//    result shouldBe "it's a draw"
//
//  }

  "The who won calculator" should "make 2C 8S beat AD 10C when the board is 2S JD 7C QH 3H" in {

    val result = WhoWonCalculator.winningHand(handOne = List(("2", "C"),("8", "S")), handTwo = List(("A", "D"),("10", "C")),
      board = List(("2", "S"), ("J", "D"), ("7", "C"), ("Q", "H"), ("3", "H")))

    result shouldBe "hand one wins"

  }
  "The who won calculator" should "make 2C 8S lose to AD 10C when the board is AC JD 7C QH 3H" in {

    val result = WhoWonCalculator.winningHand(handOne = List(("A", "C"),("8", "S")), handTwo = List(("A", "D"),("10", "C")),
      board = List(("2", "S"), ("J", "D"), ("7", "C"), ("Q", "H"), ("3", "H")))

    result shouldBe "hand two wins"

  }
}
