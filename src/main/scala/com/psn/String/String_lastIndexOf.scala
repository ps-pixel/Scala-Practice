package com.psn.String

object String_lastIndexOf {
  def main(args: Array[String]): Unit = {

    val result = "GeeksforGeeks".lastIndexOf("ek")
    println(result)//10
    val result1 = "GeeksforGeeks".lastIndexOf("Geek")
    println(result1)//8
    val result2 = "GeeksforGeeks".lastIndexOf("ek", 12)
    println(result2)//10

    val result3 = "GeeksforGeeks".lastIndexOf("Geek", 4)
    println(result3)

    val result4 = "Nidhi".indexOf('i', 2)
    println(result4)//So, here the first occurrence of ‘i’ is after second index is four So, 4 is returned as output.

    val result5 = "NidhiSingh".indexOf('h', 4)
    println(result5)
    val result6 = "GeeksforGeeks".lastIndexOf('e', 4)

    // Displays output
    println(result6) //Here, the searching begins from the index 4, from right to the left position and the one which is appearing first is returned.
    val result7 = "GeeksforGeeks".lastIndexOf('f', 1)

    // Displays output
    println(result7)//Here, the method is not able to find the stated character while searching from left towards right from the index specified. So, it returns -1 here.


  }

}
