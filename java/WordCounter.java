import java.io.FileInputStream;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filename = "example.txt"; // replace with your file name
        String wordToSearch = "A"; // replace with your word

        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            int count = 0;
            int ch;

            while ((ch = fileInputStream.read()) != -1) {
                if (ch == wordToSearch.charAt(0)) {
                    count++;
                }
            }

            System.out.println("The word '" + wordToSearch + "' appears " + count + " times in the file.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}