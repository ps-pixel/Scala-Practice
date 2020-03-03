package com.psn.OOPS.AccessModifier

class Private {
  private var a:Int = 123
  def display()
  {
    a = 8
    println(a)
  }
}

object access extends App
{
  // class abc is accessible
  // because this is in the same enclosing scope
  var e = new Private()
  e.display()

}
//Here we declared a variable ‘a’ private and now it can be accessed only inside it’s defining class or through classes object.