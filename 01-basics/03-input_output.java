import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println();
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);

        input.close();
    }
}