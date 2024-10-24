import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
public class BlankTrimmer {
    public static void main(String[] args) {
        File fileName;
        PrintWriter out = null;
        Scanner in = null;
        String outputValue = "";
       try{
           fileName = new File("HelloSima.txt");
           in = new Scanner(fileName);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
       while(in.hasNextLine()){
           String value = in.next();
           outputValue +=value;
       }
       try{
           fileName = new File("HelloSima.txt");
           out = new PrintWriter(fileName);
           out.println(outputValue);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
       out.close();
       in.close();

    }
}
