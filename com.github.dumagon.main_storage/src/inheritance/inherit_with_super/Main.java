package inheritance.inherit_with_super;

public class Main {

    public static void main(String[] args) {

        Derived dd=new Derived(20,67);//20 assigns der, 67 assigns (super ) that assigns base with 67 in class Base

        System.out.println(dd.getBase());
        System.out.println(dd.der);

        }
    }

