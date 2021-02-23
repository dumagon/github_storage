package enumeratition_enum.enumeration_with_fields;

enum Numbers {ONE(100),TWO(200),THREE(300);
      int value;

    /** in enums constructors are always private
     */

  private  Numbers (int value){
        this.value=value; }

        int getValue (){
        return value; }
}



public class NewNum {
    public static void main(String[] args) {

        Numbers number =Numbers.ONE;
        Numbers number1 =Numbers.TWO;
        Numbers number2 =Numbers.THREE;
        System.out.println(number.getValue());
        System.out.println(number1.getValue());
        System.out.println(number2.getValue());


    }
}
