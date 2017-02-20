package alarmclock

object BillingService {

   def billCalculator(customerOrder: List[String]): String = {

      val totalPriceWithoutServiceCharge = getPrices(customerOrder)

      val serviceChargePercentage = customerOrder match {
        case order if order.contains("SteakSandwich")  => 1.2
        case order if order.contains("CheeseSandwich") => 1.1
        case _ => 1.0
      }

    val totalPrice = addServiceCharge(totalPriceWithoutServiceCharge, serviceChargePercentage)

    s"Your bill is: £$totalPrice"

  }

  private def getPrices(customerOrder: List[String]): Double  ={

    val price = customerOrder map {
      case "Cola" => 0.85
      case "Coffee" => 1.45
      case "CheeseSandwich" => 2.30
      case "SteakSandwich" => 4.25

    }
    price.sum
  }

 private def addServiceCharge(price: Double, serviceChargePercentage: Double): Double = {

    BigDecimal(price * serviceChargePercentage).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}
