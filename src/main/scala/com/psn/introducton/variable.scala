package com.psn.introducton

object variable {
  def main(args: Array[String]): Unit = {
//Declaring variable:
//variables are 2 types: 1)-Immutable:(val) 2)-mutable:(val)
//To declare a value that we cannot mutate/change, we use the keyword ‘val’. This is immutable.
    val x:Int=7
    val name:String= "Ayushi"
    // x=8
    // error reassign to val
    //variables which allow us to change a value after the declaration of a variable.
    // Mutable variables are defined by using the var keyword.
    var favoriteDonut: String = "Glazed Donut"
    favoriteDonut = "Vanilla Donut"
    //runs fine so var value can be changed not val

   //-------------------------------------------------------------------------------------------------------
    //Rules for naming variable in Scala
    //
    //Variable name should be in lower case.
    //Variable name can contain letter, digit and two special characters(Underscore(_) and Dollar($) sign)
    //Variable name must not contain the keyword or reserved word.
    //Starting letter of the variable name should be an alphabet.
    //White space is not allowed in variable name.

    //-------------------------------------------------------------------------------------------------------
    //multiple assignments
    //Scala supports multiple assignments, but you can use multiple assignments only with immutable variables.
    val (x1,y) = (10, "ten")
    var (strName, iAge, dExperienceInYears) = ("John", 28, 3.5)
    strName = "Jolly" //Allowed

    //Variable Type Inference
    //The phenomenon in which the Scala compiler can identify the type of
    // the variable based upon the initial value assigned is called Variable Type Inference.
    val studid = 10;
    var studname = "Adam"
   //Lazy initialization
    //Sometimes you may wish to delay the initialization of some variable until at the point
    // where it is consumed by your application. This is usually referred to as lazy initialization and
    // we need to make use of the lazy keyword
    lazy val donutService = "initialize some donut service"

  }


}
