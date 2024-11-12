package java1.java2;

public class Task {
   static int a = 10;
   static int b = 20;

   public static void main(String[] args) {
       page1 p1 = new page1();
       p1.display();

       page2 p2 = new page2();
       p2.display();

   }
}    

class page1 extends Task {
    int a = 5;
    int b = 15;


  void display() {
    Task.a=a;
    Task.b=b;

       
        System.out.println("a from page1: " + a);
        System.out.println("b from page1: " + b);

    }
}

class page2 extends page1 {

    int a = 16;
    int b = 28;

    void display() {
       
        Task.a=a;
        Task.b=b;
        
       
        System.out.println("a from page2: " + a);
        System.out.println("b from page2: " + b);
    }

 }