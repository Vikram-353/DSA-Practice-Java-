package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Example of counting even numbers in a list
        List<Integer> list = Arrays.asList(2, 3, 1, 4, 6, 8, 80, 90, 40, 70);
        // traditional method
        int count = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        // Using Streams

        System.out.println(list.stream().filter(x -> x % 2 == 0).count());

        // Creating Streams
        // 1. With Collections
        List<Integer> li = Arrays.asList(2, 3, 4, 5, 6, 7);
        li.stream();

        // 2. With Arrays
        Integer[] arr = { 2, 1, 3, 2, 4, 3, 4 };
        Stream<Integer> nw = Arrays.stream(arr);
        nw.forEach(System.out::println);

        // 3. Using Streams.of

        Stream<String> stream2 = Stream.of("q", "w", "e");
        System.out.println(stream2.collect(Collectors.toList()));
        // 4. Infinite Stream
        System.out.println(Stream.generate(() -> 1).limit(20).collect(Collectors.toList()));

        System.out.println(Stream.iterate(0, x -> x + 1).limit(5).collect(Collectors.toList()));

    }

}
