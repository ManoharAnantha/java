package java1.java2.java3;

abstract class Vehicle {  
    String brand ;
    public Vehicle(String brand) {
        this.brand=brand;
    }
public abstract void start();
public abstract void stop();

public void displayInfo(){
System.out.println("Vehicle brand:"+brand );
}
}  