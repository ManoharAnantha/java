

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 5 / 0;
            // sc.close(); Problem!
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
        
    }
}