// Time complexity : O(n*)

import java.io.*;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("input4.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output4.txt"));
        ) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            String numbers[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(numbers[i]);
            }

            selectionSort(arr);

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