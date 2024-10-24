import java.io.File;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class ExpectedOutput {
    public static void main(String[] args) {
        File inFile = new File("myInput.txt");
        File outFile = new File("myOutput.yxt");
        try{
            inFile.createNewFile();
            outFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(Scanner in = new Scanner(inFile); PrintWriter out = new PrintWriter(outFile)){
            int count=1;
            while (in.hasNextLine())
            {
                String value = in.nextLine();
                out.printf("*/ %d */ %s%n",count,value);
                count++;
               // System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
