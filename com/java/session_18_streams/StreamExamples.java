package session_18_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String... args) {
        List<String> strignList = Arrays.asList("a", "b", "c");
        Stream<String> stringListStream = strignList.stream();

        Map<String, Integer> map = new HashMap<>();
        map.put("Ana", 25);
        map.put("Ion", 30);

        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valStream = map.values().stream();

        //-----------------------------------------------------------------------

        int[] nr = {1, 2, 3, 4, 5};
        IntStream nrStream = Arrays.stream(nr);

        //-------------------------------------------------------------------------

        Stream<String> customStream = Stream.of("a", "b", "c");

        //-------------------------------------------------------------------------

        try (Stream<String> lines = Files.lines(Path.of("example.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
