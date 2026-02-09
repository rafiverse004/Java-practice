// Stack using Array List

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // Push(ADD) function
        public static void push(int data){
            list.add(data);
        }

        // Pop(DELETE) function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1); // Array List store data at last
            list.remove(list.size()-1);
            return top;
        }

        // Peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    // Driver class
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Stack.push(5);
        Stack.push(10);
        Stack.push(15);

        System.out.println(Stack.peek());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.isEmpty());

        scanf.close();
    }
}
