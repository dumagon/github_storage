package lambda;

interface ParamRef{public int compareStrings(String str1,String str2);}


public class LambdaRefParam {
	
	public static void main(String[] args) {

		ParamRef pr =String::compareTo;
		
		int result =pr.compareStrings("gnat","rat");
		
		System.out.println(result);
		
		
	}

}
