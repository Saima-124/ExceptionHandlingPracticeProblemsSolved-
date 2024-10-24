import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;

public class ReverseLineSerial {
    public static void main(String[] args)  {

        File inFile = new  File("input.txt");
        File outFile = new  File("output.txt");
        String line = "";

        try {
            inFile.createNewFile();
            outFile.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Scanner in = new Scanner(inFile); PrintWriter out = new PrintWriter(outFile)) {
            while (in.hasNextLine()) {
                String input = in.nextLine();
                line = "\n" + input + line ;
            }
            out.print(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}