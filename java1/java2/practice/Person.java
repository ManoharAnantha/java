package java1.java2.practice;

public class Person {
    private String name;
    private int age;

    public Person (){
        this.name="unknown";
        this.age=0;
        }

     public Person (String name,int age){
        this.name=name;
         this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
     public void setAge(int age){
       this.age=age;
  }
       public void details(){
        System.out.println("name "+name);
        System.out.println("age "+age);
     }

     public static void main(String[] args) {
        Person m=new Person();
        System.out.println("default argments");
        m.details();
        Person L=new Person("Manu",23);
        System.out.println("with argments");
        L.details();
        m.setName(" Likhi");
        m.setAge( 22);
        System.out.println("i love you");
        m. details();
     }
}
