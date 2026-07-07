import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Dhaka");
        cities.add("Chattogram");
        cities.addFirst("Khulna");
        cities.addLast("Sylhet");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}