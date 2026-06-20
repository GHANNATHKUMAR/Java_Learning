import java.io.StringReader;
import java.io.StringWriter;
import java.io.FileWriter;
import java.io.IOException;

public class endsem13 { //StringReaderWriterToFile
    public static void main(String[] args) {
        String input = "This is an example of StringReader and StringWriter with file writing.";

        try (
                StringReader reader = new StringReader(input);
                StringWriter writer = new StringWriter();
        ) {
            int data;
            // Read from StringReader and write to StringWriter
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            // Print in-memory content
            System.out.println("In-memory Output: " + writer.toString());

            // Write StringWriter content to a file
            try (FileWriter fileWriter = new FileWriter("output.txt")) {
                fileWriter.write(writer.toString());
            }

            System.out.println("Content successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
