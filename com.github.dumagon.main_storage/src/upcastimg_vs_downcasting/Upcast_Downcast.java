package upcastimg_vs_downcasting;


class Herbivorous {

    public void ImEating (){
        System.out.println("I am eating ");
    }
}

class Zebra extends Herbivorous{

    public void ImaZebra(){
        System.out.println("Im a Zebra");
    }
}

public class Upcast_Downcast {
    public static void main(String[] args) {

        Zebra Zeb = new Zebra();
        Herbivorous animal=Zeb;
            // upcasting ..now the object Zeb has only the method 'ImEating'
           // cuz it is given realization through the class Herbivorous
          /// Zeb already has both methods but when we change the link into animal
         // we now can only see one method (ImEating)
        //but the other method is still there ,though inapplicable.....


        animal.ImEating();

        Zebra newZeb =(Zebra)animal; // down casting ...
          newZeb.ImaZebra();
          newZeb.ImEating();

          // after down casting the object changes its link to the one belonging to the class Zebra
         // and the method ImaZebra becomes visible again .......


          Herbivorous newAnim =new Herbivorous();
          Zebra zebra =(Zebra)newAnim;
          zebra.ImaZebra();
            // Here we created an object of the class Herbivorous which contains solely the method ImEating
           //  and after we down cast it the system starts to look at the object through the link of the class Zebra
          //  therefore we can see and opt for the method ImaZebra which is now visible but not existing in the object
         // so trying to run it we get the error ----
        // !!!!cannot be cast to class !!!!!




    }
}
