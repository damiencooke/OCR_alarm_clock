import org.scalatest.{Matchers, FlatSpec}

class CanaryTest extends FlatSpec with Matchers {

  "2 + 2 " should "equal 4" ignore  {
    2 + 2 shouldBe 4
  }

}
