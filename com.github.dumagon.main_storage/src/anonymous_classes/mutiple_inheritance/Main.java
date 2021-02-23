package anonymous_classes.mutiple_inheritance;

public class Main {

    public static void main(String[] args) {

        Phone p1=new Phone();
        Phone p2=new Phone();


        Computer c1 =new Computer();
        Computer c2 =new Computer();

        MobilePhone m1 = new MobilePhone();
        MobilePhone m2 = new MobilePhone();

        Phone [] pp ={p1,p2,m1};
        Computer [] cc={c1,c2,m2.factory()};

        //// we used an anonymous class  /////

        for (Phone temp:pp) {temp.process();
            System.out.print("\n");}


        System.out.println("--------------------------------------------------------");

        for (Computer temp:cc) {temp.process();
            System.out.print("\n");}




    }
}
