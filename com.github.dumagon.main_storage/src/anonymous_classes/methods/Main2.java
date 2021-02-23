package anonymous_classes.methods;

interface SomeInterface{
    void method();
    int getValue();
}

class SomeClass implements SomeInterface{
    protected int protectedInt ;

    @Override
    public void method() {

        protectedInt=100;

    }

    @Override
    public int getValue() {

        return protectedInt;
    }
}

public class Main2 {
    public static void main(String[] args) {

        SomeClass instance1 =new SomeClass(){

            public void method (){
                super.method();
                System.out.println("from 1  ");
            }
        };



        SomeInterface instance2 =new SomeClass(){
             protected int protected1=8;
            public void method(){
               super.method();
            }

            public int getValue (){
                return this.protected1+super.getValue();
            }
        };

        instance1.method();
        instance2.method();

        System.out.println(" from 1 "+instance1.getValue()+"  from 2 "+instance2.getValue());



    }
}
