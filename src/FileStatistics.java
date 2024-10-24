import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user for the file name
        System.out.print("Enter the file name (with extension): ");
        String fileName = inputScanner.nextLine();

        // Create a File object
        File file = new File(fileName);

        try {
            // Create a scanner to read the file
            Scanner fileScanner = new Scanner(file);

            int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            // Process the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                characterCount += line.length(); // Count characters in the line
                wordCount += line.split("\\s+").length; // Count words in the line
            }

            // Close the file scanner
            fileScanner.close();

            // Print the results
            System.out.println("Number of characters: " + characterCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } finally {
            inputScanner.close();
        }
    }
}
