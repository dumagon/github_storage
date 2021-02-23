package file_reading;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFileRead {
    public static void main(String[] args) {
    	
    	String q ="xnas gnats";


        String separator =File.separator;

       // String path ="C:"+separator+"Users"+separator+"zackn"+separator+"Desktop"+separator+"New Text2.txt";
        String path ="C:"+separator+"Users"+separator+"zackn"+separator+"Desktop"+separator+"New Text Document (2).txt";


        File mikeBiography=
                new File(path);

       try{
           Scanner scanReader=new Scanner(mikeBiography);
           String myLine=q;

         // String myLine =scanReader.next();
           String[] myReading=myLine.split(" ");
          
           
           System.out.println(Arrays.toString(myReading));
           scanReader.close();


       }catch(IOException e){

           System.out.println(" no file like that found");


       }






    }
}
