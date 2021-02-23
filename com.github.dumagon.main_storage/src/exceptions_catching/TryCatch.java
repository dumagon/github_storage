package exceptions_catching;

import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

        int a=6;
        
        System.out.println("type");

        int b=scan.nextInt();



        try{

            a=a/(2-b);
            System.out.println("a is "+a);
        }catch(Exception e){

            System.out.println("there is an exception");
            System.out.println(e.getMessage());
            System.out.println("the whole description is "+e);

        }
        
        scan.close();


    }
}
