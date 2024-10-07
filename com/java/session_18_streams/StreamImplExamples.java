package session_18_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplExamples {
    public static void main(String... args) {
        filterOddNumbers();
        flatMapExample();
        concatenateListOfStrings();
        calculateAVG();
    }

    private static void calculateAVG() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(avg);
    }

    private static void concatenateListOfStrings() {
        List<String> words = Arrays.asList("apple", "banana", "orange");

        String result = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    private static void flatMapExample() {
        List<Person> people = Arrays.asList(
                new Person("Bob", Arrays.asList("cititul", "mancatul")),
                new Person("Ana", Arrays.asList("plimbare", "gaming"))
        );

        //Obtinem un stream cu liste de hobiuri
        Stream<List<String>> hobbyList = people.stream().map(Person::getHobbies);
        // Apelam streamu-ul de liste si il concatenam intr-un stream de strings cu flatMap
        Stream<String> hobbies = hobbyList.flatMap(List::stream);
        hobbies.forEach(System.out::println);
    }

    public static void filterOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //before

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer nr : numbers) {
            if (nr % 2 == 0)
                oddNumbers.add(nr);
        }

        System.out.println("Odd numbers: " + oddNumbers);

        //@formatter:off
        List<Integer> streamOddList = numbers.stream()
                                             .filter(n -> n % 2 == 0)
                                             .toList();
        //@formatter:on
    }
}
