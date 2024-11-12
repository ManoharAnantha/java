package java1.java2;



public   class Cat extends Animal2 {
    void sound(){
        System.out.println("the cat meows");
    }
    public static void main(String[] args) {
        Animal2 a=new Dog2();
        a.sound();
        Animal2 a2=new Cat();
        a2.sound();
    }
}
