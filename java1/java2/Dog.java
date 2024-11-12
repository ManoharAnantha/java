package java1.java2;

public class Dog extends Animal {
    void bark(){
        System.out.println("The dog can bark");
    }

public static void main (String arges[]){
    Dog dog =new Dog();
    dog.eat();
    dog.bark();
}
}