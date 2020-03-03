package com.psn.Functions

object Anonymous_Functions_3 extends App {


  /**
   * An anonymous function is also known as a function literal.
   * A function which does not contain a name is known as an anonymous function.
   * An anonymous function provides a lightweight function definition.
   * It is useful when we want to create an inline function.
   * Syntax:
   *
   * (z:Int, y:Int)=> z*y
   * Or
   * (_:Int)*(_Int)
   *--------------------------------------------------------------------------------------------------
   * In the above first syntax, => is known as a transformer.
   * The transformer is used to transform the parameter-list of the left-hand side of the symbol
   * into a new result using the expression present on the right-hand side.
   *
   * --------------------------------------------------------------------------------------------------
   * In the above second syntax, _ character is known as a wildcard is a shorthand way to represent a
   * parameter who appears only once in the anonymous function.
   */

   //Anonymous Functions With Parameters
   /**
   * When a function literal is instantiated in an object is known as a function value.
   * Or in other words, when an anonymous function is assigned to a variable then we can invoke that
   * variable like a function call. We can define multiple arguments in the anonymous function.
   */
   // Creating anonymous functions
   // with multiple parameters Assign
   // anonymous functions to variables

   var myfc1 = (str1:String, str2:String) => str1 + str2

  // An anonymous function is created
  // using _ wildcard instead of
  // variable name because str1 and
  // str2 variable appear only once

  var myfc2 = (_:String) + (_:String)
  // Here, the variable invoke like a function call
  println(myfc1("PSnayak", "12Geeks"))
  println(myfc2("Psnayak90", "forGeeks"))

  //Anonymous Functions Without Parameters
  //We are allowed to define an anonymous function without parameters.
  // In Scala, We are allowed to pass an anonymous function as a parameter to another function.
  // Creating anonymous functions
  // without parameter
  var myfun1 = () => {"Welcome to ........!!"}
  println(myfun1())

  // A function which contain anonymous
  // function as a parameter
  def myfunction(fun:(String, String)=> String) =
  {
    fun("Dog", "Cat")
  }

  // Explicit type declaration of anonymous
  // function in another function
  val f1 = myfunction((str1: String,
                       str2: String) => str1 + str2)

  // Shorthand declaration using wildcard
  val f2 = myfunction(_ + _)
  println(f1)
  println(f2)

}
