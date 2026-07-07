import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Rafik");
        students.put(2, "Sakib");
        students.put(3, "Nayeem");

        System.out.println(students.get(2));

        for (Integer key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}