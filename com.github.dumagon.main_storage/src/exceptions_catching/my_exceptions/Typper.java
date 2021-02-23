package exceptions_catching.my_exceptions;

import java.util.Scanner;

public class Typper {
    public static void main(String[] args) {

    	int switcher=0;

        while (switcher==0){
        	Scanner scan =new Scanner(System.in);

            int a =6;
            
            System.out.println("please type any number but 2");

            int b=scan.nextInt();
            
         
            
            
            
            try{

                a=a/(2-b);

                if(a<=0){
                    throw new UserException();
                }

                System.out.println(a);

            }catch(UserException e){

                e.callAnException();

            }catch(Exception e){

                System.out.println("input error ");


            }finally {

                if (b == 2) {
                	
                	Typper.closeScanner(scan);
                	switcher=1;

                    System.out.println("you just entered 2 !!!!  the session is over ");
                   
                
                } else {
                    System.out.println("you typed  " + b);
                    
                    
                }
            }







        }







    }
    
 static   void closeScanner(Scanner  a) {
    	
    	a.close();
    	
      }


}
