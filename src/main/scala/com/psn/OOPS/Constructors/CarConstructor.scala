package com.psn.OOPS.Constructors

class CarConstructor(make: String, model: String, fuel: Int) {
  // Name of the class is Car

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
    def main(args: Array[String]) {

      // Multiple Class object
      var obj1 = new CarConstructor("BMW", "X7", 40);
      var obj2 = new CarConstructor("Mercedes Benz", "S350D", 50);
      obj1.Display();
      obj2.Display();
    }
}

