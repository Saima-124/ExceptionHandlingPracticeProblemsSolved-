import java.io.File;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class RowSum {
    public static void main(String[] args) {
        File inputFile = new File("row.txt");
        //File outputFile = new File("rowSum.txt");
        try{
            inputFile.createNewFile();
            //outputFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            Scanner in = new Scanner(inputFile);
            double count=0;
            double totalNumber=0;
            while (in.hasNextLine()){
                String line = in.nextLine().trim();
                if(line.isEmpty()){
                    System.out.println(0);
                }else{
                    String[] numbers = line.split("\\s+");

                    for(String number : numbers){
                        totalNumber+=Double.parseDouble(number);
                        count++;
                    }
                    double average = totalNumber / count;
                    System.out.println(average);
                }

            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
