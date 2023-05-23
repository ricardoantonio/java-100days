import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class LimitWhitStream {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        long result = limit.count();
        System.out.println("result = " + result);

        Stream<String> stream2 = strings.stream();
        Stream<String> limit2 = stream2.limit(4);

        List<String> result2 = limit2.collect(Collectors.toList());
        System.out.println("result2 = " + result2);
    }
}
