package file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        String separator=File.separator;

        String path="C:"+separator+"Users"+separator+"zackn"+separator+"Desktop"+separator+"test.txt";

        File test=new File(path);

        Scanner scan =new Scanner(test);

        while(scan.hasNext()){

            System.out.println(scan.next());
        }
        
        scan.close();

    }
}
