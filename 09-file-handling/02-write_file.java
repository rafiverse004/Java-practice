import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Java\n");
            writer.write("File handling example.");

            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}