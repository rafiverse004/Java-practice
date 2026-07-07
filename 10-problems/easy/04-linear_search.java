class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        int target = 20;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}