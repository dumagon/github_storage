package lambda;

interface Deserializer{public int deserializer(String str);}

class StringConverter{
	
	public int convertToInt(String str) {
		
		return Integer.valueOf(str);
		
	}
	
	
}





public class LambdaMethRef {
	
	public static void main(String[] args) {

StringConverter strCon =new StringConverter();

Deserializer ds = strCon::convertToInt;

System.out.println(ds.deserializer("654"));

		
		
		
	}

}










