class ReturnValues {

    static int add(int a, int b) {
        return a + b;
    }

    static double square(double number) {
        return number * number;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        double result = square(5.5);

        System.out.println(sum);
        System.out.println(result);
    }
}