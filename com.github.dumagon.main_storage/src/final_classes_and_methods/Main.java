package final_classes_and_methods;

abstract class Maths{}


    final   class AnotherMath extends Maths {  //can not be inherited
      
        
        public AnotherMath() {}
        
        int addThese(int a,int b) {
        	int summation ;
        	
        
        	
        	summation =Integer.parseInt(Integer.toBinaryString(a)+Integer.toBinaryString(b),2);
        	
        	
        	
        	
        	return summation;
        	
        }
        
    }

     class NormalMath  extends Maths{
    	 
    	 int addThese(int a,int b) {
    		 int sum;
    		 
    		 sum=a+b;
    		 return sum;
    	 }

 }

   public class Main{

       public static void main(String[] args) {
    	   
    	   AnotherMath math =new AnotherMath();
    	   NormalMath math1 =new NormalMath();
    	   
    	   int result =math.addThese(2,2);
    	   
    	   System.out.println(result);
    	   System.out.println(math1.addThese(2, 2));
    	   
    	

       }




    }

