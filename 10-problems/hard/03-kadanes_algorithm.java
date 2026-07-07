class KadanesAlgorithm {
    public static void main(String[] args) {

        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}