package com.psn.OOPS.Class_Object;

class vehicle {
    private int id;
    private int year;
    private String model;
    private String company;

    private int miles;

    public vehicle(int id, int year, String model, String company, int miles) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.company = company;
        this.miles = miles;
    }

    // drive is just an opertaion not attribute so we can't decalre as it fileds we have to declare it by method
    public void drive(int distance) {
        miles = miles + distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
   public class vehicleTest {
       public static void main(String[] args) {
           vehicle v1 = new vehicle(100,2013,"swift","maruti",0);
           System.out.println("Vehicle id =>" + v1.getId());
           System.out.println("Vehicle year =>" + v1.getYear());
           System.out.println("Vehicle model => " +v1.getModel());
           System.out.println("Vehicle company =>" + v1.getCompany());
           System.out.println("Vehicle Miles Before Drive =>" + v1.getMiles());
           v1.drive(100);
           System.out.println("Vehicle Miles After Drive =>" + v1.getMiles());

       }

}
