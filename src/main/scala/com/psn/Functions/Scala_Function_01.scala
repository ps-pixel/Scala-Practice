package com.psn.Functions

object Scala_Function_01 {
  def main(args: Array[String]): Unit = {

    // declaration and definition of function
    def functionToAdd(a: Int, b: Int): Int = {
      var sum: Int = 0
      sum = a + b
      // returning the value of sum
      return sum
    }
    // Calling the function
    println("Sum is: " + functionToAdd(5, 3));
  }
//  define and use a function which has no parameters and has a return type

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")

  def favoriteDonut(): String = {
    "Glazed Donut"
  }
// How to define and use a function with no parenthesis
  def leastFavoriteDonut = "Plain Donut"
    println(s"My least favorite donut is $leastFavoriteDonut")

//  How to define and use a function with no return type
  def printDonutSalesReport(): Unit = {
  // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
    }
  printDonutSalesReport()

//
}
