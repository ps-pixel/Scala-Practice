package com.psn.OOPS.AccessModifier

class Public {
  var a:Int = 123
}
object access3 extends App
{
  var e = new Public()
  e.a = 444
  println(e.a)

}
//We can access these anywhere.