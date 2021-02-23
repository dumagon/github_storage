package generics_list;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        /////////////////////////   JAVA 5   ////////////////////////////////////////

        
		List animals=new ArrayList();

        Bull ourBull =new Bull();

        animals.add("cat");
        animals.add("raccoon");
        animals.add("zebra");
        animals.add(56);
        animals.add(ourBull);

        // Here we have to down cast

        Object obj =animals.get(4);

        System.out.println(obj);


        String animal =(String) animals.get(2);
       
        
        
        System.out.println(animal);


        Integer ourInt =(Integer)animals.get(3);

        System.out.println(ourInt);

        ///////////////////////////  GENERIC  //////////////////////////////////////


        List <String> more_animals =new ArrayList<String>();

        // here we parameterized our list to contain only Strings

        more_animals.add("giraffe ");
        more_animals.add("badger");
        more_animals.add("buffalo");

        String animal2 = more_animals.get(0);
        System.out.println(animal2);



        /////////////////////////// JAVA 7 ///////////////////////////////

        List <String> more_animals2 =new ArrayList<>();
                                             //                                  ____________







    }


}
class Bull 
{
	String myString="I am a bull";
	
	
	public String toString() {
		
		return myString;
	}


}

















