package java1.java2.java3;

import java.util.ArrayList;

public class ExceptionExample {
            public static void main(String[] args) {
                ArrayList<String> M=new ArrayList<>();
               
                try {
                    while (true) {
                    M.add("manohar");}
                } catch (OutOfMemoryError e) {
                    System.out.println( e);
                    System.out.println();
                }
                   finally{
                    System.out.println();
                   }
            
            }

        }
        
