package exceptions_catching.if_vs_try_cath;

public class TemperatureException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static final int  MAX =-51;
 
 @Override
   public String getMessage(){

       return "This is extremely cold outside !!!!"+MAX;
   }
}
