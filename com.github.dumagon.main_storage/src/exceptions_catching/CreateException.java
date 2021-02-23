package exceptions_catching;

class UserException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void method() {

        System.out.println("my exception!");

    }
}

public class CreateException {
    public static void main(String[] args) {

        try{

            throw new UserException();
        }catch(UserException e){

            System.out.println("exception processing");

            e.method();
        }


    }
}
