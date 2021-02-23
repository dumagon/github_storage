package exceptions_catching;

public class MultipleExceptions {

    public static void main(String[] args) {

        try{


                try{


                    try{

                        throw new Exception (" Squirrel Exception");

                    }catch(Exception e){

                        System.out.println("Catch 1 "+e.getMessage());

                        throw new Exception();

                    }finally {

                        System.out.println(" finally 1");
                    }




                    }catch (Exception e){

                    System.out.println("Catch 2 "+e.getMessage());

                    throw new Exception();

                     }finally {
                    System.out.println("finally 2");
                    throw new Exception(" Badger Exception ");
                }





        }catch (Exception e){

            System.out.println("Catch 3  "+e.getMessage());
        }finally {
            System.out.println("finally 3");
        }



    }
}
