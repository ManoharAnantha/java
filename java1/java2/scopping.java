package java1.java2;

public class scopping {
    public void dosomething(){
       
        int x = 12;
        System.out.println(x);
        { int q = 96;
        System.out.println(q);}
 
      }
    public static void main(String[] args) {
        scopping obj=new scopping();
        obj.dosomething();
    }       
}