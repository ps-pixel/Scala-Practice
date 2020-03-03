package com.psn.OOPS.Class_Object

class Car {
  // Name of the class is Car

  // Class variables
  var make: String = "BMW"
  var model: String = "X7"
  var fuel: Int = 40

  // Class method
  def Display()
  {
    println("Make of the Car : " + make);
    println("Model of the Car : " + model);
    println("Fuel capacity of the Car : " + fuel);
  }
}
object Main
{

  // Main method
  def main(args: Array[String])
  {

    // Class object
    var obj = new Car();
    obj.Display();
  }
}
//Well, the above code does not completely utilize the privileges an object-oriented program is capable of.
// Since the output of the above code will return the same result irrespective of how many times you run.
// You defined static variables inside the class, and the values of those variables will remain constant,
// even if you create infinite new objects.
// In conclusion, you cannot expect it to give you details for a Mercedes Benz or a Ferrari car.

/**here comes the constructor work**/