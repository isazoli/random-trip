package isaszol.hofs

import scala.annotation.tailrec

object Factorial {

  def factorial(n: Int): Int = calculateHof(accuInitialValue = 1)(_ * _)(n)

  def calculateHof(accuInitialValue: Int)
                  (accuFunction: (Int, Int) => Int)
                  (n: Int): Int = {

    @tailrec
    def calc(n: Int, accu: Int): Int = {
      if (n <= 0) accu
      else calc(n - 1, accuFunction(accu, n))
    }

    calc(n, accuInitialValue)
  }

  def calculate(n: Int): Int = {

    @tailrec
    def calc(n: Int, accu: Int): Int = {
      if (n <= 0) accu
      else calc(n - 1, accu * n)
    }

    calc(n, accu = 1)
  }

}
