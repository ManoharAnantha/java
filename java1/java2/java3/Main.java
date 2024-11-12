package java1.java2.java3;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tata",5);
        c.start();
        c.stop();
        c.dispalyCarDetails();
        c.displayInfo();
        Bike b=new Bike("honda","sp");

        b.start();
        b.stop();
        b.dispalyBikeDetails();
        b.displayInfo();



    }
}
