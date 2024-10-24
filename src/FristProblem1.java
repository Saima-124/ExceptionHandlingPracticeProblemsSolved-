import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FristProblem1 {
    public static void main(String[] args){
    String fileName = "hello.txt";
    try (PrintWriter out = new PrintWriter(fileName)){
        //Scanner p = new Scanner(input);
        out.println("Hello World!");
    }catch(FileNotFoundException e) {
        System.out.println("File writing error" + e.getMessage());
    }
    try (Scanner in = new Scanner(new File(fileName))){
        String message = in.nextLine();
        System.out.println(message);
    }catch(FileNotFoundException e){
        System.out.println("File not Found : " + e.getMessage());

        }

    }
}
