package exceptions_catching;


import java.io.FileInputStream;

class AnotherUserException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void method (){
        System.out.println(" my other exception");
    }


}

public class FileImputEx {
    public static void main(String[] args) {

        try{

            throw new AnotherUserException();
        }catch(AnotherUserException e){

            System.out.println("exception handling ");
            e.method();

            try{
                FileInputStream fs =new FileInputStream("C: \\ NonexistentFile.log");
            }catch (Exception ex){

                System.out.println(ex.getMessage());


            }


        }

    }
}
