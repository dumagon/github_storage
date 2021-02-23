package exceptions_catching;

public class WithFinally {
    public static void main(String[] args) {

        int a =5,b=2;

        try{

            System.out.println("a = "+(a/(2-b) ));
            
        }catch(Exception e){
        	 System.out.println("division by zero might have happened ");

            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
            System.out.println(a+b);
        }

        System.out.println(" the end ");

    }

}
