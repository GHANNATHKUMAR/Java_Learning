import java.io.*;

public class Lab11_3 {
    public static void main(String[] args) {

        File file = new File("notes.txt");

        try {
            // -----------------------------
            // 1. Write to the file
            // -----------------------------
            FileWriter writer = new FileWriter(file);
            writer.write("Java is a powerful programming language.\n");
            writer.write("File handling is an important concept.\n");
            writer.write("This file contains some sample text.");
            writer.close();

            // -----------------------------
            // 2. Read the file and count words
            // -----------------------------
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");  // split by spaces
                wordCount += words.length;
            }
            reader.close();

            // -----------------------------
            // 3. Display the result
            // -----------------------------
            System.out.println("Number of words in notes.txt: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

