package com.psn.introducton

object DataType {
  def main(args: Array[String]): Unit = {
   //scala.Any, scala.AnyRef and scala.AnyVal
   //
    var a: Boolean = true
    var a1: Byte = 126
    var a2: Float = 2.45673f
    var a3: Int = 3
    var a4: Short = 45
    var a5: Double = 2.93846523
    var a6: Char = 'A'
    if (a == true)
    {
      println("boolean:psscalatutorial")
    }
    println("byte:" + a1)
    println("float:" + a2)
    println("integer:" + a3)
    println("short:" + a4)
    println("double:" + a5)
    println("char:" + a6)
  }
}
