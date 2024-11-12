package java1.java2.practice;

class Manohar{
    void sound(){
        System.out.println("Show me ur photo");
    }

}
    class Overr  extends Manohar{

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Overr {
        // @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
    public class Over1 {
        public static void main(String[] args) {
            Manohar myDog = new Dog();
           Manohar h=new Overr(); 
           Manohar dj=new Manohar(); 
            myDog.sound();
             
          h.sound();
          dj.sound();
        }
    }

