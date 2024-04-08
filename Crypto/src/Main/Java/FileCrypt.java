import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCrypt {
    public void ReadingFile() throws FileNotFoundException {
        try {
            Scanner fileIn = new Scanner(new File("/Users/ethan/Desktop/Projects/SimpleCrypt/sonnet18.txt"));
            while (fileIn.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
