import java.io.*;

public class MergeSort {
    
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        
        while (idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String args[]){
        try(
            BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));
        ) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            String Numbers[] = br.readLine().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(Numbers[i]);
            }

            divide(arr, 0, n-1);
            for(int i=0; i<n; i++){
                bw.write(arr[i] + " ");
            }
            System.out.println("MergeSort done. Check input2.txt");
            
            bw.newLine();
            br.close();
            bw.close();

        } catch(IOException e) {
            System.out.println("IOException error: " + e.getMessage());
        }
    }
}
