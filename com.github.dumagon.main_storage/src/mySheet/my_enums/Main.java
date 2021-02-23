package mySheet.my_enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Names stranger_1 = Names.John;
        Names stranger_2 = Names.Chuck;
        Names stranger_3 = Names.Marvin;
        Names stranger_4 = Names.Sean;

        Scanner scan = new Scanner(System.in);

        System.out.println(" if you want to talk press 1 ,otherwise 0 ");

        int option;

        do {
            int option1 = scan.nextInt();

            option = option1;


            switch (option1) {
                case 1:

                    System.out.println("what's your name ?");

                    String name = scan.next();

                    switch (name) {

                        case "John":

                            System.out.println("where are you now John?");

                            String myLocation = scan.next();

                            stranger_1.myLocation(myLocation);

                            System.out.println("I'm in " + stranger_1.location);

                            System.out.println("if you want to ask  (what is your nationality ?) press 1  ");

                            String nation=scan.next();

                            switch (nation){

                        case "1":
                                    stranger_1.myNationality();

                                    break;


                                default:

                                    System.out.println("I don't know what you are talking about ");
                                    break;
                            }

                            System.out.println("if you want to ask  (how old are you ?) press 2  ");


                            String age =scan.next();

                            switch (age) {


                                case "2":

                                    System.out.println("I'm " + stranger_1.getAge());

                                    break;

                                default:
                                    System.out.println(" I'm tired so I gotta go ");

                                    break;


                            }

                                    break;

                        case "Sean":

                            System.out.println("where are you now Sean?");

                            String myLocation3 = scan.next();

                            stranger_4.myLocation(myLocation3);

                            System.out.println("I'm in " + stranger_4.location);


                            System.out.println("if you want to ask  (what is your nationality ?) press 1  ");

                            String nation1=scan.next();

                            switch (nation1){

                                case "1":
                                    stranger_4.myNationality();

                                    break;


                                default:

                                    System.out.println("I don't know what you are talking about ");
                                    break;
                            }

                            System.out.println("if you want to ask  (how old are you ?) press 2  ");


                            String age1 =scan.next();

                            switch (age1) {


                                case "2":

                                    System.out.println("I'm " + stranger_4.getAge());

                                    break;

                                default:
                                    System.out.println(" I'm tired so I gotta go ");

                                    break;


                            }



                            break;


                        case "Chuck":

                            System.out.println("where are you now Chuck?");

                            String myLocation2 = scan.next();

                            stranger_2.myLocation(myLocation2);

                            System.out.println("I'm in " + stranger_2.location);

                            System.out.println("if you want to ask  (what is your nationality ?) press 1  ");

                            String nation2=scan.next();

                            switch (nation2){

                                case "1":
                                    stranger_2.myNationality();

                                    break;


                                default:

                                    System.out.println("I don't know what you are talking about ");
                                    break;
                            }

                            System.out.println("if you want to ask  (how old are you ?) press 2  ");


                            String age2 =scan.next();

                            switch (age2) {


                                case "2":

                                    System.out.println("I'm " + stranger_2.getAge());

                                    break;

                                default:
                                    System.out.println(" I'm tired so I gotta go ");

                                    break;


                            }

                            break;

                        case "Marvin":

                            System.out.println("where are you now Marvin?");

                            String myLocation4 = scan.next();

                            stranger_3.myLocation(myLocation4);

                            System.out.println("I'm in " + stranger_3.location);

                            System.out.println("if you want to ask  (what is your nationality ?) press 1  ");

                            String nation3=scan.next();

                            switch (nation3){

                                case "1":
                                    stranger_3.myNationality();

                                    break;


                                default:

                                    System.out.println("I don't know what you are talking about ");
                                    break;
                            }

                            System.out.println("if you want to ask  (how old are you ?) press 2  ");


                            String age3 =scan.next();

                            switch (age3) {


                                case "2":

                                    System.out.println("I'm " + stranger_3.getAge());

                                    break;

                                default:
                                    System.out.println(" I'm tired so I gotta go ");

                                    break;


                            }

                            break;

                        default:

                            System.out.println(" sorry '"+name+"' is not in my list of the interviewed , next time pal ");

                    }

                    break;

                case 0:
                    System.out.println("I don't want to talk ");
                    break;

                default:
                    System.out.println(" incorrect input , try again ");


            }


        } while (option != option * option);
        
        scan.close();
    }
}





