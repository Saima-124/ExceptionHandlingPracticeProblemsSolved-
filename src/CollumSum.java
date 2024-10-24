import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class CollumSum {
    public static void main(String[] args) {
        File inFile = new File("collum.txt");
        File outFile = new File("collumA.txt");
        int i=0;
        double total1=0,total2=0;
        try{
            inFile.createNewFile();
            outFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(Scanner in = new Scanner(inFile);PrintWriter out = new PrintWriter(outFile)){
            while (in.hasNextDouble()){
                i++;
                total1+=in.nextDouble();
                total2+=in.nextDouble();
            }
            out.printf("%f %f",total1/i,total2/i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}