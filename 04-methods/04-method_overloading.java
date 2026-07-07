class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(5.5, 2.5));
    }
}