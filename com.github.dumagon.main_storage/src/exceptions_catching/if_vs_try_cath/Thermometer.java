package exceptions_catching.if_vs_try_cath;

import java.util.Scanner;

public class Thermometer {

    int typeTemperature() throws TemperatureException{

        Scanner readThermometer=new Scanner (System.in);

        System.out.println(" please look at your thermometer and type the number ");

        int fromThermometer=readThermometer.nextInt();
        
        readThermometer.close();

        final int EXTREME_TEMPERATURE=-51;

        if(fromThermometer==EXTREME_TEMPERATURE){
            throw new TemperatureException();
        }else{
            return fromThermometer;
            
            
        }

        
    }

}
