import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println(numbers);

        System.out.println(numbers.contains(30));
    }
}