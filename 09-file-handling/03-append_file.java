import java.io.FileWriter;
import java.io.IOException;

class AppendFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt", true);

            writer.write("\nThis line was appended.");

            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}