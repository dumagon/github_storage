package exceptions_catching;

class MyExceptions extends Exception{
     public void throwInner ()throws Exception{

         throw new Exception("inner exception !");


     }

     public void catchInner () throws Exception {

         try{
             this.throwInner();
         }catch(Exception e){
             throw new Exception("outer exception!",e);
         }

     }

}

public class ManyExceptions {
    public static void main(String[] args) {

        MyExceptions meEx =new MyExceptions();

        try{
            meEx.catchInner();
        }catch(Exception e){

            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
