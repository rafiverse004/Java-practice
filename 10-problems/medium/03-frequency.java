class Frequency {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 2, 4};

        int target = 2;
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}