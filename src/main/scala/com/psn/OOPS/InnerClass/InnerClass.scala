package com.psn.OOPS.InnerClass

class InnerClass {

    // Inner class
    class G1
    {
      var a = 0
      def method()
      {
        for(a<-0 to 3)
        {
          println("Welcome to inner class: G1");
        }
      }
    }
  }
  object Main
  {
    def main(args: Array[String])
    {

      // Creating object of the outer and
      // inner class Here, G1 class is
      // bounded with the object of InnerClass class
      val obj = new InnerClass();
      val o = new obj.G1;
      o.method();
    }


}
