import java.io.*;

// ---------- Layer 1: File Service ----------
class FileService {
    public String readFile(String fileName) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            return br.readLine();   // read first line
        } catch (IOException e) {
            System.out.println("FileService: Logging error → " + e.getMessage());

            // RETHROW to BusinessLogic
            throw new IOException("FileService error while reading file: " + fileName, e);
        }
    }
}


// ---------- Layer 2: Business Logic ----------
class BusinessLogic {
    FileService fs = new FileService();

    public void processData() throws IOException {
        try {
            String data = fs.readFile("data.txt");  // file missing?
            System.out.println("BusinessLogic: Data = " + data);
        } catch (IOException e) {
            System.out.println("BusinessLogic: Received error, sending upward...");

            // RETHROW to Main
            throw e;
        }
    }
}


// ---------- Layer 3: Main ----------
public class endsem11 {
    public static void main(String[] args) {
        BusinessLogic bl = new BusinessLogic();

        try {
            bl.processData();
        } catch (IOException e) {
            System.out.println("\nMAIN: FINAL HANDLING");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("\nProgram continues normally...");
    }
}

