package static_Explained.static_fields_for_objects;

public class Account3 {

    static int a=89;
    int b=44;

    public static void main(String[] args) {


        Account3 xx =new Account3();

        int c=50;
        System.out.println(a);
        System.out.println(c);
        System.out.println(Account3.a);
        System.out.println(xx.b);
        xx.cc();

    }

     void cc(){
        System.out.println(b);
    }

}






















