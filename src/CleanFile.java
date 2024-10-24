import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CleanFile {
    public static void main(String[] args) {
        // Specify the file name (change this to your file path)
        String fileName = "example1.txt";
        File file = new File(fileName);

        try {
            // Read the entire file content into a List
            List<String> lines = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();

            // Remove blank lines from the start
            int startIndex = 0;
            while (startIndex < lines.size() && lines.get(startIndex).trim().isEmpty()) {
                startIndex++;
            }

            // Remove blank lines from the end
            int endIndex = lines.size() - 1;
            while (endIndex >= startIndex && lines.get(endIndex).trim().isEmpty()) {
                endIndex--;
            }

            // Create a new list with non-blank lines
            List<String> cleanedLines = new ArrayList<>();
            for (int i = startIndex; i <= endIndex; i++) {
                cleanedLines.add(lines.get(i));
            }

            // Write the cleaned lines back to the same file
            FileWriter writer = new FileWriter(file);
            for (String line : cleanedLines) {
                writer.write(line + System.lineSeparator());
            }
            writer.close();

            System.out.println("File cleaned successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
