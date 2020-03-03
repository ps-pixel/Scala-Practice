package com.psn.Functions

object Currying_Functions_2 {
  def main(args: Array[String]): Unit = {
    /**
     * Currying in Scala is simply a technique or a process of transforming a function.
     * This function takes multiple arguments into a function that takes single argument.
     * It is applied widely in multiple functional languages.
     *
     * Syntax
     *
     * def function name(argument1, argument2) = operation
     */
    def add(x: Int, y: Int) = x + y;
    println(add(20, 19));

    /**
     * Here, we have define add function which takes two arguments (x and y)
     * and the function simply adds x and y and gives us the result, calling it in the main function.
     */
    /**
     * Another way to declare currying function
     * Suppose, we have to transform this add function into a Curried function,
     * that is transforming the function that takes two(multiple) arguments into a function
     * that takes one(single) argument
     *
     *
     * Syntax
     *
     * def function name(argument1) = (argument2) => operation
     */
    //transforming the function that
    // takes two(multiple) arguments into
    // a function that takes one(single) argument.

    def add2(a: Int) = (b: Int) => a + b;
    println(add2(20)(19));

//Currying Function Using Partial Application
    /**
     * We have another way to use this Curried function and that is Partially Applied function.
     * So, let’s take a simple example and understand. we have defined a variable sum in the main function
     */
    def add3(a: Int) = (b: Int) => a + b;
    // Partially Applied function.
    val sum1 = add3(29);
    println(sum1(5));

//    another way(syntax) to write the currying function.
    def add4(a: Int) (b: Int) = a + b;
    println(add4(29)(5));

    // Curring function declaration
    def add5(a: Int) (b: Int) = a + b;
    // Partially Applied function.
    val sum2=add5(29)_; //Here, only the ‘_’ is added after the calling the function add5 for value of sum.
    println(sum2(5));

  }

}
