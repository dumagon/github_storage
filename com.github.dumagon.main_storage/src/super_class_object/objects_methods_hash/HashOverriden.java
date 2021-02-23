package super_class_object.objects_methods_hash;

class NewCar{
	
	private boolean booleanValue =true;

	private  char charValue ='d';
	private String stringValue="String";
	private long longValue =122234567778L;                                                ///                                   The content       (fields).
	private float floatValue =1667.7678F;
	private double doubleValue =3456.78;
	private byte[] arrayValue = {1,2,3,5};
	
	
	public NewCar (String stringValue, long longValue,double doubleValue) {
		
		this.stringValue=stringValue;
		this.longValue=longValue;
		this.doubleValue=doubleValue;
		
	}
	
	
	@Override
	public int hashCode () {
		
		int result =17;                                                                 //     We take '17'  as a starting point to create a hash code . 
		
		result=37*result + (booleanValue ? 1 :0);                     //   We use multiplication to " spread"  the numbers on the numeric line in order to make 
		result=37*result+(int) charValue;                                //                         our hash code more unique   
		result=37* result + (int) (longValue^(longValue>>>30));
		result= 37*result +(stringValue==null ? 0 : stringValue.hashCode());
		result =37*result +Float.floatToIntBits(floatValue);
		
		long long_bits=Double.doubleToLongBits(doubleValue);
		
		result=37*result +(int) (long_bits^long_bits>>>30);
		
		for ( byte  a  : arrayValue  ){
			
			result= 37*result + (int) a;
			
		}
		
		return result;                     //                 So now if the content of the objects is the same we will get the same numbers at the end .
		                                           //                   Thus objects with same fields will have same hash codes .
		
			}
	
	
	}




public class HashOverriden {
	
	
	public static void main(String[] args) {
		
		
		NewCar car1 =new NewCar("Hey",44554455,6768.78);
		NewCar car2 =new NewCar("Hey",44554455,6768.78);
		NewCar car3 =new NewCar("Hey y'all ",44554477,99999.78);
		
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());

		
		
		
	}
	

}
