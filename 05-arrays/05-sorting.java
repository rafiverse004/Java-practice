import java.util.Arrays;

class Sorting {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 4, 1, 3};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}