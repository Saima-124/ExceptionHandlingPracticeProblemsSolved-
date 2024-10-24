import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
public class RevFile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the input path file name :");
        String inputFileName = console.next();
        String fl1="";
        File inputFile = new File(inputFileName);
        try{
            Scanner in = new Scanner(inputFile);
            StringBuilder inputs = new StringBuilder();
            while(in.hasNextLine()){
                String input = in.nextLine();
                inputs.append(input);
                inputs.reverse();
                fl1+=inputs + "\n";

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try(PrintWriter out = new PrintWriter(inputFileName)){
            out.printf("%s",fl1);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
