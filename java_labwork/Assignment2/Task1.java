// Time Complexity : O(nlogn)

import java.io.*;
import java.util.*;

public class Task1 {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }

        Arrays.sort(mergedArray);

        return mergedArray;
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

        int n1 = Integer.parseInt(br.readLine().trim());
        int[] arr1 = new int[n1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        int n2 = Integer.parseInt(br.readLine().trim());
        int[] arr2 = new int[n2];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        int[] result = merge(arr1, arr2);
        writeArray(result, bw);

        br.close();
        bw.close();
    }
}
