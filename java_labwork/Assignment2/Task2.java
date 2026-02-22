// Time Complexity : O(n1 + n2) = O(n)

import java.io.*;
import java.util.*;

public class Task2 {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedArray[] = new int[arr1.length + arr2.length];

        int idx1 = 0;
        int idx2 = 0;
        int x = 0;

        while(idx1 < n1 && idx2 < n2){
            if(arr1[idx1] <= arr2[idx2]){
                mergedArray[x++] = arr1[idx1++];
            } else {
                mergedArray[x++] = arr2[idx2++];
            }
        }
        while (idx1 < n1) {
            mergedArray[x++] = arr1[idx1++];            
        }
        while (idx2 < n2) {
            mergedArray[x++] = arr2[idx2++];
        }

        return mergedArray;
    }

    public static void writeArray(int[] arr, BufferedWriter bw) throws IOException {
        for (int num : arr) {
            bw.write(num + " ");
        }
        bw.newLine();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));

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
