// package java1.java2.java3.collections;
    import java.util.function.Function;
import java.util.function.Predicate;

interface Manohar{
    void print();
 }     

public class Sam {
    public static void main(String[] args) {
        Predicate<String> p = new Predicate<String>() { 
            @Override
            public boolean test(String name) {
                return name.startsWith("S");
            }
        };
        System.out.println(p.test("Manohar"));
        Function<String,Integer>f = new Function<String,Integer>() {
            @Override
            public Integer apply(String name) {  // Love uhh prasanna 
                return 7;
            }
        }; 
        System.out.println(f.apply("pakithan"));
      
    // Anomous class
    Manohar s =new Manohar(){             
        @Override
        public void print(){
            System.out.println("Manohar Prasanna");
        }
    };

    s.print();
    Manohar s2=()->System.out.println("Manohar");
    s2.print();
}
    }

