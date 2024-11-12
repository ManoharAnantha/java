package java1.java2;

    public class Circle {
        public static final double PI = 3.14159;
        public double r;
        public Circle(double r)
         { this.r = r; }

        public Circle() 
        { r = 1.0;}

        public double circumference()
         { return 2 * PI * r; }

        public double area() 
        { return PI * r*r; }
        public static void main(String args[]){
            Circle c = new Circle();
            System.out.println("circumference"+ c.circumference());
            System.out.println("area"+ c.area());    

        }

    }
     



