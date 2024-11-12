package java1.java2;

public class Puppy extends Dog1{
    void weep(){
        System.out.println("the puppy can weep");
    }
public static void main (String args[]){ 
    Puppy puppy=new Puppy();
    puppy.eat();
    puppy.bark();
    puppy.weep();
}
}

