package exceptions_catching;

class MyExceptionA extends Exception{
	
	String message;
	
	public MyExceptionA(String message) {
		
		this.message=message;
		
	}
@Override
	public String getMessage() {
		return message;
	}
	

   // public MyExceptionA(String message){
      //  super(message);

 //   }
}

class MyExceptionB extends MyExceptionA {
	


   public MyExceptionB(String message){

        super(message);
    }
}

public class MultipleCatch {

    public static void main(String[] args) {

        try{

        //    throw new MyExceptionA("A");
        	
        	throw new MyExceptionB("ee");
            
            
        
        }catch (MyExceptionB e){
            System.out.println(e.getMessage()); 


        }catch (MyExceptionA e){

            System.out.println(e.getMessage());
        }
        catch(Exception e){

            System.out.println(e.getMessage());


        }
        
        MyExceptionA a =new MyExceptionA("ass");
        
        System.out.println(a.getMessage());

  }

}
