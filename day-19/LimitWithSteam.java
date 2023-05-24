import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitWithSteam {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        List<String> result = strings.stream().limit(4).collect(Collectors.toList());
        System.out.println("result = " + result);

        List<String> result2 = strings.stream().sorted().limit(4).toList();
        System.out.println("result2 = " + result2);

        // Passing a lambda to sort ignoring Case
        List<String> result3 = strings.stream().sorted(
                (s1, s2) -> s1.compareToIgnoreCase(s2)
        ).limit(4).toList();
        System.out.println("result3 = " + result3);
    }
}
