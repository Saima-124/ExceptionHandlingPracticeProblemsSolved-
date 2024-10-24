import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;

public class CharacterWordsLine {
    public static void main(String[] args) {
        File inFile = new File("count.txt");
       int lineCount=0,wordCount=0,characterCount=0;
       try{
           inFile.createNewFile();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       try(Scanner in = new Scanner(inFile)){
           while (in.hasNextLine()){
               String line = in.nextLine();
               characterCount+=line.length();
               String[] words=line.trim().split("\\s+");
               if(words.length>0 && !words[0].isEmpty()){
                   wordCount++;
               }
               lineCount++;
           }
           System.out.println("Number of characters: " + characterCount);
           System.out.println("Number of words: " + wordCount);
           System.out.println("Number of lines: " + lineCount);
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
    }
}