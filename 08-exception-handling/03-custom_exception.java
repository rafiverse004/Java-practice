class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

class CustomException {
    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}