package anonymous_classes.mutiple_inheritance;

public class MobilePhone extends Phone {

    ////// creating a factory method ///////
    /// a factory is a method that creates objects ////

    Computer factory (){
        return new Computer(){
            @Override
            void process() {

                System.out.print("(");
                super.process();
                System.out.print(")");
                System.out.println("Mobile");
            }
        };

    }


    @Override
    void process (){
        System.out.print("(");
        super.process();
        System.out.print(")");
        System.out.println("Mobile");
    }
}
