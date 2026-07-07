class Palindrome {
    public static void main(String[] args) {

        String text = "madam";

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println(text.equals(reversed));
    }
}