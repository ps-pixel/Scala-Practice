package com.psn.OOPS.Inheritance

import java.util.jar.Attributes.Name

class Oops {
  var name:String = "Ankita"
  class Oops2 extends Oops
  {
    var Article_no: Int = 130

    // Method
    def details()
    {
      println("Author name: " +name);
      println("Total numbers of articles: " +Article_no);
    }
  }

  object Main5
  {

    // Driver code
    def main(args: Array[String])
    {

      // Creating object of derived class
      val ob = new Oops2();
      ob.details();
    }
  }


}
