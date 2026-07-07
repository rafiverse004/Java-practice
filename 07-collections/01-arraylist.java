class StringComparison {
    public static void main(String[] args) {

        String first = "Java";
        String second = "Java";
        String third = new String("Java");

        System.out.println(first == second);
        System.out.println(first == third);

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));

        System.out.println(first.equalsIgnoreCase("java"));
    }
}