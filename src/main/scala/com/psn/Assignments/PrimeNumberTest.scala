package com.psn.Assignments
import scala.util.control.Breaks._

object PrimeNumberTest {
  def main(args: Array[String]): Unit = {
    var totalPrimeNumber = 0
    for (i <- 1 to 1000) {
      if(isPrimeNumber(i))
        totalPrimeNumber += 1
    }
    println(s"# of prime numbers between 1 to 1000 = $totalPrimeNumber")

  }
  def isPrimeNumber(num: Int): Boolean = {
    var counter = 0
    breakable {
      for (j <- 2 to num / 2) {
        if (num % j == 0) {
          counter = 1
          break;
        }
      }
    }
    if (counter == 0)
      true
    else
      false
  }


}
