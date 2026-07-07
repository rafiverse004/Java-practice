class PrefixSum {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] prefix = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int value : prefix) {
            System.out.println(value);
        }
    }
}