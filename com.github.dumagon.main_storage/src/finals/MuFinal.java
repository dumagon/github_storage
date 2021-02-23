package finals;

 class MuFinal {

         final int CONSTANT;//!!!!the name of a final variable is capitalized (CONSTANT) not (constant)!!!!!!


    public MuFinal(int CONSTANT) {//!!!!!!you can assign a final only once in a constructor !!!!!!!

        this.CONSTANT=CONSTANT;
    }

//    public void setCONSTANT(int CONSTANT){ // <<error can not assign the final>>
//        this.CONSTANT=CONSTANT;
//
//    }
}

class MyNewFinal{

     static final  int CONSTANT2=10;//most often finals are declared static to avoid unnecessary  consumption of RAM
         public static int not_final =0;

}

class Main {
    public static void main(String[] args) {

       // MyNewFinal.CONSTANT2=2; !!!error cannot be reassigned through the name of the class cuz final !!!!!
        MyNewFinal.not_final=34;

        final int  inMain =0;

        //inMain=3; !!!!!non static finals also cannot be changed !!!!!


    }

}
