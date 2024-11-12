package java1.java2.java3;

public class Bike extends Vehicle {
    String type;
      public Bike(String brand,String type){ 
        super(brand);
        this.type=type;
      }

public void dispalyBikeDetails(){
    
    System.out.println("Bike Type "+this.type);
}

@Override
public void start() {
   
    System.out.println("bike start with button "+brand);
}

@Override
public void stop() {
    System.out.println("bike stops with button "+brand);
}
}
 