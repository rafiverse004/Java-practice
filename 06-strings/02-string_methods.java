class StringMethods {
    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("Java"));
        System.out.println(text.startsWith("Java"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.replace("Java", "Python"));
        System.out.println(text.substring(5));
    }
}