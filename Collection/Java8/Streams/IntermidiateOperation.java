package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermidiateOperation {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2, 1, 3, 1, 4, 2, 5, 6, 7, 8);
        List<String> name = Arrays.asList("Akrity", "Avinash", "Rohit", "Shayam", "Manas");
        // Intermediate operations

        // Filter
        System.out.println(name.stream().filter(x -> x.startsWith("A")).count());

        // Distict
        System.out.println(name.stream().filter(x -> x.startsWith("A")).distinct().count());

        // Sorted
        System.out.println(li.stream().sorted((x, y) -> x - y).collect(Collectors.toList()));

        // map
        System.out.println(li.stream().map(x -> x * 2).collect(Collectors.toList()));
        System.out.println(name.stream().map(x -> x.toLowerCase()).toList());// toList can directly be used as Stream
                                                                             // collectors in recent version of java

        // Termination Poerations

        // forEach
        li.stream().forEach(x -> System.out.println(x + 1));

        // REDUCE
        System.out.println(li.stream().reduce(Integer::sum).get());

        // MatchAny MatchAll MAtchNone

        System.out.println(li.stream().allMatch(x -> x > 0));
        System.out.println(li.stream().noneMatch(x -> x < 0));
        System.out.println(li.stream().anyMatch(x -> x % 2 == 0));

        // findFirst Findany

        // example
        String greet = "hello World";
        System.out.println(greet.chars().filter(x -> x == 'l').count());// chars function provide the stream of
                                                                        // corresponding ASCII value of characters out
                                                                        // of String

        // Statefull stateless

        // FlatMap
        List<String> st = Arrays.asList(
                "hello world",
                "My name is Vikram Ranjan");
        System.out.println(st.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toUpperCase).toList());
    }
}
