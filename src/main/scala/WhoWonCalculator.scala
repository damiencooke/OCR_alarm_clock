
object WhoWonCalculator {

  case class PokerCard(value: Int, colour: String)
  case class PokerHand(firstCard: PokerCard, secondCard: PokerCard)
  case class Board(board: List[PokerCard], highCard: Boolean = false)
  case class Opponent(name: String, pokerHand: PokerHand, result: Option[Result] = None)
  case class Result(ranking: Int, highCard: Int)

  def winningHand(handOne: List[(String, String)], handTwo: List[(String, String)], board: List[(String, String)]): String = {

    val opponentOne = Opponent("hand one", handValue(handOne))
    val opponentTwo = Opponent("hand two", handValue(handTwo))
    val tableValue = boardValue(board)

    whoWon(opponentOne, opponentTwo, tableValue)
  }


  def handValue(hand: List[(String, String)]): PokerHand = {

   val listOfPokerCards = hand.map(card => getCardValue(card))

   PokerHand(firstCard = listOfPokerCards.head, secondCard = listOfPokerCards.tail.head)

  }

  def boardValue(board: List[(String, String)]): Board = {

    val pokerBoard = board.map(card => getCardValue(card))

    Board(pokerBoard)

  }

  def getCardValue(card:(String, String)): PokerCard = {

    card._1 match {
      case "A" => PokerCard(14, card._2)
      case "K" => PokerCard(13, card._2)
      case "Q" => PokerCard(12, card._2)
      case "J" => PokerCard(11, card._2)
      case _ =>   PokerCard(card._1.toInt, card._2)
    }
  }

  def whoWon(opponentOne: Opponent, opponentTwo: Opponent, tableValue: Board): String = {

    /*val whoWon = highCard(opponentOne, opponentTwo, tableValue)

    if(whoWon.isDefined) {
     val whoWonName = whoWon.get.name
      s"$whoWonName wins"
    } else s"it's a draw"*/
  }

  /*def highCard(opponentOne: Opponent, opponentTwo: Opponent, tableValue: Board): Option[Opponent] = {

    val boardLowestValue = tableValue.board.map(card => card.value).min
    val opponentOneHighestCard = math.max(opponentOne.pokerHand.firstCard.value, opponentTwo.pokerHand.secondCard.value)
    val opponentTwoHighestCard = math.max(opponentTwo.pokerHand.firstCard.value, opponentTwo.pokerHand.secondCard.value)

    if (opponentOneHighestCard > opponentTwoHighestCard && opponentOneHighestCard > boardLowestValue) {
      Some(opponentOne.copy(highCard = true))
    } else if (opponentTwoHighestCard < opponentOneHighestCard && opponentTwoHighestCard > boardLowestValue) {
      Some(opponentTwo.copy(highCard = true))
    } else None

  }*/
    /*def pair(opponentOne: Opponent, opponentTwo: Opponent, tableValue: Board) = {

      val opponentOnePairCheck = checkPairForBothOpponents(opponentOne, tableValue)
      val opponentTwoPairCheck = checkPairForBothOpponents(opponentTwo, tableValue)

      if (opponentOnePairCheck.pair) {

      }

    }
    def checkPairForBothOpponents(opponent: Opponent, tableValue: Board) ={
      opponent.pokerHand match {
        case pairInHand if pairInHand.firstCard.value == pairInHand.secondCard.value => opponent.copy(pair = true)
        case pairOffBoard if tableValue.board.contains(pairOffBoard.firstCard)| tableValue.board.contains(pairOffBoard.secondCard) => opponent.copy(pair = true)
      }
    }*/
  }
