import java.io.*;

public class InsertSort {

    public static void insertSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("input3.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output3.txt"));
        ) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            String numbers[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(numbers[i]);
            }

            insertSort(arr);

            for(int i = 0; i < n; i++){
                bw.write(arr[i] + " ");
            }
            bw.newLine();

            System.out.println("InsertSort done. Check output3.txt file.");

        } catch(IOException e){
            System.out.println("IOException: " + e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("Invalid number format in file");
        }
    }
}