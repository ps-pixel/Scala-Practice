package com.psn.String

object String_01 {
  def main(args: Array[String]): Unit = {

    var str1 = "Hello"
    val str2: String = "Geeks"

    // Display both strings
    println(str1);
    println(str2);
    // Get the length of str1 and str2 strings
    // using length() function
    var LEN1 = str1.length();
    var LEN2 = str2.length();

    // Display both strings with their length
    println("String 1:" + str1 + ", Length :" + LEN1);
    println("String 2:" + str2 + ", Length :" + LEN2);

    // Scala program to illustrate how to concatenate strings
    // concatenate str1 and str2 strings
    // using concat() function
    var Newstr = str1.concat(str2);

    // Display strings
    println("String 1:" +str1);
    println("String 2:" +str2);
    println("New String :" +Newstr);

    // Concatenate strings using '+' operator
    println("This is the tutorial" +
      " of Scala language" +
      " on My portal");
    // Scala program to illustrate how to Creating format string

    var A_name = "Ankita "
    var Ar_name = "Scala|Strings"
    var total = 130
    // using format() function
    println("%s, %s, %d".format(A_name, Ar_name, total));

    // Scala program of int regionMatches()method
    // Applying regionMatches method
    val result = "Preeti".regionMatches(0, "Preeti", 0, 4)

    // Displays output
    println(result)//true

    val result2 = "Preeti".regionMatches(0, "pReeti", 0, 4)
    println(result2)//false

  }

}
