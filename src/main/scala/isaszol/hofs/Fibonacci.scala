package isaszol.hofs

import scala.annotation.tailrec

object Fibonacci {

  def calculate(n: Int): Int = {

    @tailrec
    def calcRec(remainingSteps: Int, prev: Int, curr: Int): Int = {
      if (remainingSteps == 0) prev + curr
      else calcRec(remainingSteps - 1, curr, prev + curr)
    }

    n match {
      case 0 => 0
      case 1 => 1
      case k => calcRec(k - 2, 0, 1)
    }
  }


}
