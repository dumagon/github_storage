package inheritance.inerit_with_field_change;

public class BasicClass {

    int a=10;

    public String publicField="BasicClass.publicField";
    private  String privateField="BasicClass.privateField";
    protected  String protectedField="BasicClas.protectedField";

   public void show (){
       System.out.println(privateField);
   }
}
