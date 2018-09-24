package isaszol.hofs

import org.scalatest.{Matchers, WordSpec}
import Fibonacci.calculate

class FibonacciSpec extends WordSpec with Matchers {

  "Fibonacci number" should {
    "be 0 for 0. element" in { calculate(0) shouldBe 0 }
    "be 1 for 1. element" in { calculate(1) shouldBe 1 }
    "be 1 for 2. element" in { calculate(2) shouldBe 1 }
    "be 2 for 3. element" in { calculate(3) shouldBe 2 }
    "be 3 for 4. element" in { calculate(4) shouldBe 3 }
    "be 5 for 5. element" in { calculate(5) shouldBe 5 }
  }

}
