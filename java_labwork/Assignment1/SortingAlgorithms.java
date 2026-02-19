import java.io.*;
import java.util.*;

public class SortingAlgorithms {

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    // Optimized Bubble Sort
    public static void bubbleSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    static void writeArray(int[] arr, BufferedWriter bw) throws IOException {
        for (int num : arr) {
            bw.write(num + " ");
        }
        bw.newLine();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output1.txt"));

        int n = Integer.parseInt(br.readLine().trim());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr1[i];
            arr3[i] = arr1[i];
        }

        selectionSort(arr1);
        insertionSort(arr2);
        bubbleSort(arr3);

        bw.write("Selection sort output: ");
        bw.newLine();
        writeArray(arr1, bw);

        bw.write("Insertion sort output: ");
        bw.newLine();
        writeArray(arr2, bw);

        bw.write("Bubble sort output: ");
        bw.newLine();
        writeArray(arr3, bw);


        br.close();
        bw.close();
    }
}
