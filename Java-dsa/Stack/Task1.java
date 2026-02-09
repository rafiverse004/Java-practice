// Stack using Linked List

import java.util.Scanner;

public class Task1 {

    // Creating a NODE structure
    static class Node{
        int data;
        Node next; // Pointer which will point next NODE

        // Constructor to take the input data
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    // Creating a Stack
    static class Stack {
        // Head stored the top NODE address
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        // Push(ADD) function
        public static void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop(DELETE) function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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
