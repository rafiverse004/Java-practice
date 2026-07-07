class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Hello");

        text.append(" World");
        text.insert(5, ",");
        text.deleteCharAt(5);

        System.out.println(text);

        text.reverse();

        System.out.println(text);
    }
}