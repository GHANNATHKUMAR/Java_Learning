import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class endsem12 {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            // Create file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }

            // Write to file
            FileWriter writer = new FileWriter(file);
            writer.write(" hello navnit bhai ");
            writer.close();
            System.out.println("Successfully written!");

            // Read full content
            FileReader reader = new FileReader(file);
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
            reader.close();

            // Print content
            System.out.println("File Content: " + content);

            // Count words
            String text = content.toString().trim();
            int wordCount = 0;
            if (!text.isEmpty()) {
                wordCount = text.split("\\s+").length;
            }
            System.out.println("Word Count: " + wordCount);

        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

