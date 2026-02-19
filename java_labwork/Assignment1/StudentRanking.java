import java.io.*;
import java.util.*;

public class StudentRanking {

    public static class Student {
        int id;
        int mark;

        Student(int id, int mark) {
            this.id = id;
            this.mark = mark;
        }
    }

    public static void selectionSort(Student[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[j].mark > arr[maxIndex].mark || (arr[j].mark == arr[maxIndex].mark && arr[j].id < arr[maxIndex].id)) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                Student temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));

        int n = Integer.parseInt(br.readLine().trim());
        int ids[] = new int[n];
        int marks[] = new int[n];

        StringTokenizer stIds = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            ids[i] = Integer.parseInt(stIds.nextToken());
        }

        StringTokenizer stMarks = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            marks[i] = Integer.parseInt(stMarks.nextToken());
        }

        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(ids[i], marks[i]);
        }

        selectionSort(students);

        for (Student s : students) {
            bw.write("ID: " + s.id + " Mark: " + s.mark);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}