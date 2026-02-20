import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medicalLog.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
