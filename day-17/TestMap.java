import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        // HashMap needs two type parameters, one for the key and one for the value.
        Map<String, Integer> scores = new HashMap<>();

        // Use put() instead of add(), and takes two arguments (key, value)
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        // The get() method takes a key and returns the value
        System.out.println(scores.get("Bert"));
    }
}
