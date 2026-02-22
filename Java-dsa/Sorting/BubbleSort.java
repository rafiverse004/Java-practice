import java.io.*;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output1.txt"));
        ) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            String numbers[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            bubbleSort(arr);

            for (int i = 0; i < n; i++) {
                bw.write(arr[i] + " ");
            }

            bw.newLine();
            br.close();
            bw.close();

            System.out.println("Sorting complete. Check output1.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file");
        }
    }
}