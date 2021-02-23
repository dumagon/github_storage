package static_Explained.static_blocks;

public class Nonstatic {

    static    int A;

    ////////// static blocks is run after static fields /////////

    static {

        A=34;
    }

    ///////// method will be run after the second static block be run /////////////

    static  void prnt (){

        System.out.println(A);
    }
 //////// this block is run right after the first one /////////
    static {

        A=4;
    }
}
