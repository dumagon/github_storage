package exceptions_catching;

public class NullThrowing {

    public static void main(String[] args) {

        try{

            throw null;
        }catch (NullPointerException e){

            System.out.println("null was thrown");
        }


    }
}
