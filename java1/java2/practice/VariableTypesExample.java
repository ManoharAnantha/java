package java1.java2.practice;

    public class VariableTypesExample {

        static int staticVar = 10;
        int instanceVar = 20;
    
        public void display() {

           int localVar = 30;

            System.out.println("Local Variable: " + localVar);
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Static Variable: " + staticVar);
        }
    
        public static void main(String[] args) {
            VariableTypesExample example1 = new VariableTypesExample();
            example1.display();
    
            VariableTypesExample example2 = new VariableTypesExample();
            example2.instanceVar = 40;
            staticVar = 50; 
            example2.display();
        }
    }
    

