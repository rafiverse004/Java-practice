class ThrowThrows {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You must be at least 18 years old.");
        }

        System.out.println("Access granted.");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}