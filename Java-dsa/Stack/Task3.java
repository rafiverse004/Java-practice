// Stack using JAVA buil in

import java.util.*;
import java.util.Scanner;

public class Task3 {
    // Driver class
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        scanf.close();
    }
}
