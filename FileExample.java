import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");// you can customise this
            writer.write("Hello, Java File Handling!\n");
            writer.write("This is a second line.");
            writer.close();

            FileReader reader = new FileReader("example.txt");
            int ch;
            System.out.println("File contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
