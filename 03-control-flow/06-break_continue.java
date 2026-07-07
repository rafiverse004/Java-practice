class BreakContinue {
    public static void main(String[] args) {

        System.out.println("Break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

        System.out.println("Continue:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }

            System.out.println(i);
        }
    }
}