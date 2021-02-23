package file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SringNumberFile {

    public static void main(String[] args) throws FileNotFoundException {

        String separator =File.separator;

        String path ="C:"+separator+"Users"+separator+"zackn"+separator+"Desktop"+separator+"New Text1.txt";

        File file=new File(path);

        String path2 ="C:"+separator+"Users"+separator+"zackn"+separator+"Desktop"+separator+"New Text2.txt";

        File file2=new File(path2);

        Scanner scan =new Scanner(file);
        String line =scan.nextLine();

        String[] numbers =line.split("0");

        System.out.println(Arrays.toString(numbers));

        scan.close();



        Scanner scan2 =new Scanner(file2);

        String line2=scan2.nextLine();
        String[] numbers2=line2.split(" ");

        int[] intNumbers=new int[3];

        int counter=0;

        for(String num:numbers2){

            intNumbers[counter++]=Integer.parseInt(num);
        }

        System.out.println(Arrays.toString(numbers2));
        System.out.println(intNumbers[0]);
        System.out.println(intNumbers[1]);
        System.out.println(intNumbers[2]);

        scan2.close();

        File myFile=new File("test2");

        Scanner scan3=new Scanner(myFile);

        String fromMyFile=scan3.nextLine();

        scan3.close();

        System.out.println(fromMyFile);





    }
}
