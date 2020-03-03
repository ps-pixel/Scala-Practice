package com.psn.OOPS.AccessModifier

class Protected {
  // declaration of protected member
  protected var a:Int = 123
  def display()
  {
    a = 8
    println(a)
  }
}

// class new1 extends by class gfg
class new1 extends Protected
{
  def display1()
  {
    a = 9
    println(a)
  }
}

object access1 extends App
{
  // class abc is accessible because this
  // is in the same enclosing scope
  var e = new Protected()
  e.display()
  var e1 = new new1()
  e1.display1()

}
//When we extended abc in class new1, protected variable a is now available to be modified cause new1 is a subclass of class abc.