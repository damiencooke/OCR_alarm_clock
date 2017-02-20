package alarmclock

import org.scalatest.{FlatSpec, Matchers}

class CanaryTest extends FlatSpec with Matchers{

  val yourBillIsMessage = "Your bill is: "

  "Billing Service" should "return the correct bill if a customer buys one item and has a 10% service charge" in {
    BillingService.billCalculator(List("CheeseSandwich")) shouldBe yourBillIsMessage + "£2.53"
  }

  it should "return correct total if two items are bought and has a 10% service charge" in {
    BillingService.billCalculator(List("Cola", "Coffee")) shouldBe yourBillIsMessage +"£2.3"
  }

  it should "add a 10% service charge to the bill if there is no hot food" in {
    BillingService.billCalculator(List("CheeseSandwich", "Coffee")) shouldBe yourBillIsMessage + "£4.13"
  }

  it should "add a 20% service charge if hot food has been ordered" in {
    BillingService.billCalculator(List("SteakSandwich", "Cola")) shouldBe yourBillIsMessage + "£6.12"
  }

  it should "don't add a service charge if all items are drinks" in {
    BillingService.billCalculator(List("Cola", "Cola", "Coffee")) shouldBe yourBillIsMessage + "£3.15"
  }

  it should "add a 20% service charge if hot food has been ordered and cold food" in {
    BillingService.billCalculator(List("SteakSandwich", "CheeseSandwich")) shouldBe yourBillIsMessage + "£7.86"
  }

}
