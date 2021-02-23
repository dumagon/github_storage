package abstract_classes;

abstract class Abstract1{
    abstract void operation1();

}
abstract class Abstract2 extends Abstract1{
    abstract void operation2();
}

class Real extends Abstract2{


    @Override
    void operation1() {

        System.out.println("one");

    }

    @Override
    void operation2() {

        System.out.println("two");
        
        


    }
    
    void writeSome() {
    	
    	System.out.println("write some");
    }
}

public class Abstract_Polimorph {
    public static void main(String[] args) {

        Abstract1 aa=new Real();

        aa.operation1();
        
        Abstract2 ab =new Real();
        
        ab.operation1();
        ab.operation2();
        
        
        
        Real rr =new Real();
        
        rr.writeSome();
        rr.operation1();
        rr.operation2();
        
        


    }
}
