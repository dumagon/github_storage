package static_Explained.static_fields_for_objects;

public class Account2 {

    static int b=70,t=89,o=77;
    int p =90;

    public static void main(String[] args) {



        view();

        Account2 ac =new Account2();
        ac.view2();






    }
   static void view (){

        System.out.println(b+" "+o+" "+t);

    }

    void view2 (){
        System.out.println(b+" "+o+" "+t);
        System.out.println(p);



    }
}
