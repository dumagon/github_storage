package exceptions_catching.if_vs_try_cath;

public class ExtremeTemperature {

    public static void main(String[] args) {

   ////// we should prefer the try-catch structure to weed out unlikely-to-happen events or errors
   /////  to the if-else .

   Thermometer tempNow =new Thermometer();

   try{
        System.out.println("current temperature is  "+tempNow.typeTemperature()+" C");


    }catch (TemperatureException e){

       System.out.println(e.getMessage());
   }
}
}
