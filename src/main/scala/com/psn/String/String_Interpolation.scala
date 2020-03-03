package com.psn.String

object String_Interpolation {
  def main(args: Array[String]): Unit = {
    /**
     * String Interpolation refers to substitution of defined variables or expressions in a given String with respected values. String Interpolation provides an easy way to process String literals. To apply this feature of Scala, we must follow few rules:
     *
     * String must be defined with starting character as s / f /raw.
     * Variables in the String must have ‘$’ as prefix.
     * Expressions must be enclosed within curly braces ({, }) and ‘$’ is added as prefix.
     */
    //s Interpolator: Within the String, we can access variables, object fields, functions calls, etc.
    //variables and expressions:
    val x = 20
    val y = 10

    // without s interpolator
    val str1 = "Sum of $x and $y is ${x+y}"

    // with s interpolator
    val str2 = s"Sum of $x and $y is ${x+y}"

    println("str1: "+str1)//str1: Sum of $x and $y is ${x+y}
    println("str2: "+str2)//Sum of 20 and 10 is 30

    //function call
    // adding two numbers
    def add(a:Int, b:Int):Int =
    {
      a+b
    }
    val x1 = 20
    val y1 = 10

    // without s interpolator
    val str3 = "Sum of $x and $y is ${add(x, y)}"

    // with s interpolator
    val str4 = s"Sum of $x1 and $y1 is ${add(x, y)}"

    println("str3: " + str3)
    println("str4: " + str4)

    //How to access Object Fields in a String Literal
    //f Interpolator
    val x2 = 20.6

    // without f interpolator
    val str5 = "Value of x is $x%.2f"

    val str6 = f"Value of x is $x2%.2f"

    println("str5: " + str5)
    println("str6: " + str6)

    val x3 = 11
    // without f interpolator
    val str7 = "Value of x is $x%04d"

    // with f interpolator
    val str8 = f"Value of x is $x%04d"
    
  }

}
