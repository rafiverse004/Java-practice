import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        input.close();
    }
}