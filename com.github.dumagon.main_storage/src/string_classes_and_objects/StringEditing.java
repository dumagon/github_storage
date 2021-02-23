package string_classes_and_objects;

public class StringEditing {
    public static void main(String[] args) {

        System.out.printf("this is %s, that is %f,and of coarse here is %d\n","what?",6.7,89);
        //we have to keep our data in the original order ,if %s %f %d then "string" , 67.9 , 78 or an error comes

        System.out.printf("this is the room maker %10d\n",56);
        System.out.printf("this is the room maker %10d\n",567);
        System.out.printf("this is the room maker %10d\n",5809098);
        System.out.printf("this is the room maker %10d\n",567889999);

//        this is the room maker         56
//        this is the room maker        567
//        this is the room maker    5809098
//        this is the room maker  567889999

        System.out.printf("this is the room maker %-10d\n",56);
        System.out.printf("this is the room maker %-10d\n",56767);
        System.out.printf("this is the room maker %-10d\n",599999);
        System.out.printf("this is the room maker %-20d\n",567889999);
//
//        this is the room maker 56
//        this is the room maker 56767
//        this is the room maker 599999
//        this is the room maker 567889999

        System.out.printf("this is the float editor %f\n",5.899998);
        System.out.printf("this is the float editor %f\n",5.899);
        System.out.printf("this is the float editor %f\n",5.89966778);

    }
}
