package exceptions_catching.method_throws;


class MyClass{

    public void method () throws Exception {
        Exception ex =new Exception("new exception");

        throw ex;

    }

}

public class Main {

    public static void main(String[] args) {

        try{

            MyClass newMine =new MyClass();
            newMine.method();

        }catch(Exception e){

            System.out.println("exception processing");
            System.out.println(e.getMessage());
            System.out.println("stack trace ");
            e.printStackTrace();
        }

    }
}
