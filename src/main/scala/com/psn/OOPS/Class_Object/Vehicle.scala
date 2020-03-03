package com.psn.OOPS.Class_Object

class Vehicle (var id :Int,var year:Int,val model:String,val company:String,var miles:Int) {
def drive(distance: Int)= {
  miles += distance;

}

}
object Vehicle_Test{
  def main(args: Array[String]): Unit = {
    val v1 = new Vehicle(100, 2013, "Swift", "Maruti", 0)
    println("Vehicle Details => " + v1.id +
      "\n" + "year => " + v1.year +
      "\n" + "model => " + v1.model +
      "\n" + "company => " + v1.company +
      "\n" + "miles =>  " + v1.miles)
    v1.drive(100)
    println("Miles driven => " +v1.miles)
  }
}
