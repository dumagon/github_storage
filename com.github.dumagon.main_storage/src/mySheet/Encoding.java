package mySheet;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        int key =23;
        Scanner string =new Scanner(System.in);
        System.out.println("type");

        int a = string.nextInt();

        System.out.println(a^key);

        System.out.println("type the result ");

       int b =string.nextInt();

        System.out.println(b^key);



    }

}
