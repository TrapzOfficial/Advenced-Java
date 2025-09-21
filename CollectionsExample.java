import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println("Users list:");
        for (String user : users) {
            System.out.println(user);
        }

        HashMap<String, Integer> scores = new HashMap<>(); // this is an Begginer -advenced code
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        System.out.println("\nUser scores:");
        for (String user : scores.keySet()) {
            System.out.println(user + " - " + scores.get(user));
        }
    }
}
