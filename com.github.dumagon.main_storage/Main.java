class Bank{
    public int a=3;
    static  int i =4;

}



public class Main {
    public static void main(String[] args) {


        @SuppressWarnings("unused")
		Bank b1=new Bank();
        Bank b2=new Bank();
        @SuppressWarnings("unused")
		Bank b3=new Bank();
        @SuppressWarnings("unused")
		Bank b4=new Bank();
        Bank b5=new Bank();

         Bank.i=34;
         System.out.println(Bank.i);
         b5.a=45;
         b5.i=4;
         System.out.println(b5.a);
        System.out.println(Bank.i);
        System.out.println(b2.a);





    }
}
