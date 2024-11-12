

    public class person {
   
        String name;
        int age;
        void birthday(){
           age++;
           System.out.println(age+"is now"+age);
        }
    }   class  Driver extends person {
    long driversLicenseNumber;
    Date experationDate;
   }
   public class Main {
    public static void main(String[] args) {
        
        person john ;
        john =new person ();
        john.name="smith";
        john.age=37;

        person mary=new person();
        mary.name ="mary brown";
        mary.age=33;
        mary.birthday();

    }
}


    
