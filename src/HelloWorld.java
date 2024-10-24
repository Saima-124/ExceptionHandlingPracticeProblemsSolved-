import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
       // String fileName = "hello.txt";
        //String message = "Hello, World!";

        try (FileWriter writer = new FileWriter("hello.txt")) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader( "hello.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }


        System.out.println(content.toString());
    }
}

