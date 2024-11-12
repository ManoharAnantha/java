package java1.java2.java3;

public class Car  extends Vehicle{
  int seats;

public Car(String brand ,int seats){
    super(brand);
  this.seats=seats;

}

public void dispalyCarDetails(){
    System.out.println("Car seats -"+this.seats);
}

@Override
public void start() {
  System.out.println("car starts with key "+brand);
}

@Override
public void stop() {
  System.out.println("car stops with key "+brand);
}
}
