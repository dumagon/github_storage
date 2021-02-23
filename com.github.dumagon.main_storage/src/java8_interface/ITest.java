package java8_interface;

public interface ITest extends I1,I2 {  // an interface can extend one or more interfaces

    public static final int PRICE = 10; //fields in interfaces are always public static final !!!!
    // names of final fields are always capitalized !!!!!!

    public abstract void method();//methods in interfaces are always public abstract !!!!

    static int sum() {  //except this
        return 10 + 4;
    }                                   // in java 8 !!!!

    default int sub() {//and this
        return 50 - 6;
    }
}

interface I1{}
interface I2{}
