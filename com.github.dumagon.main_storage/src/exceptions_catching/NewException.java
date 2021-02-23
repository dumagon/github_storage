package exceptions_catching;

public class NewException {

    public static void main(String[] args) {

    //   Exception myException =new Exception(" some exception");

        try{
         //   throw myException;

           throw new Exception("my exception");
           
        }catch (Exception e){

            System.out.println(e.getMessage());
            System.out.println("exception processing ");
        }

    }
}
