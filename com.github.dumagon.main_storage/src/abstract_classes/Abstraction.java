package abstract_classes;

abstract class AbstractA{ //-----CLASS PARENT

    public AbstractA(){//---STEP 2

        System.out.println("AbstractA ");//--STEP 3
        this.AbstractMethod(); //--STEP 4
        System.out.println("AbstractB");//--STEP 6
    }

    public abstract void AbstractMethod ();
}

class RealA extends AbstractA {// -----DERIVED CLASS

    String a="FIRST";

    public  RealA(){///---------STEP 7 ---

        System.out.println("RealA ");//--RealA extends another class so go up there

        a="SECOND";
    }


    @Override
    public void AbstractMethod() {//STEP 5

        System.out.println("realization of AbstractA vs RealA "+a);//a is not realized in AbstractA so
//                                                 a is null and the up casted object does not realize a at first
    }
}

public class Abstraction {
    public static void main(String[] args) {


        AbstractA instance=new RealA();//--FIRST STEP--

        System.out.println("----------------");

        instance.AbstractMethod();//STEP 8


    }
}
