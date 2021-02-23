package static_Explained.static_fields_for_objects;

public class Account {
	
	  double KR ;
    static double  KRtoUSD=3.5;
    String name;
   
    

    public static void main(String[] args) {

        Account a=new Account();
        a.KR=576;
        a.name="Bob";

        Account a1000=new Account();
        a1000.KR=898;
        a1000.name="Rick";
        
        System.out.println(Account.KRtoUSD);

        System.out.println(a1000.KR+" "+a.KR+" "+a1000.name+" "+a.name+" "+a1000.KRtoUSD+" "+a.KRtoUSD);
        
        
        



    }
}
