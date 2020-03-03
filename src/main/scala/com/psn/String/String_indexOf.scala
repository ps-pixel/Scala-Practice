package com.psn.String

object String_indexOf {
  def main(args: Array[String]): Unit = {
    // Applying indexOf method
    val result = "Nidhi".indexOf('i')
    println(result)

    val result2 = "Nidhi".indexOf('h')
    println(result2)

    val result3 = "Nidhisinghis".indexOf("his", 4)
    println(result3)

    val result4 = "Nidhisinghis".indexOf("is", 5)
    println(result4)
    // Applying indexOf method
    val result5 = "NidhiSingh".indexOf("dh")

    // Displays output
    println(result5)

    val result6 = "NidhiSingh".indexOf("Sin")

    // Displays output
    println(result6)

  }

}
