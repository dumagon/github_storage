package constant;

public class MyCalc {

    private static final float PI_NUMBER;
    int pi;

    static {

        PI_NUMBER = 30.67F; ///static block (initializer) is executed at first
    }

    {
        pi = 667; ////not static block is executed after all static blocks and methods


    }
}