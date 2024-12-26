package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> li = Stream.iterate(0, x -> x + 1).limit(20000).toList();
        List<Long> factorialN = li.stream().map(ParallelStreamDemo::factorial).toList();
        System.out.println(factorialN);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

        startTime = System.currentTimeMillis();
        factorialN = li.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println(totalTime);

        // foreachOrdered
        List<Integer> numbers = Arrays.asList(2, 3, 1, 43, 10, 49, 8, 9, 0);
        System.out.println("Using forEachOrdered");
        numbers.parallelStream().forEachOrdered(System.out::println);
        System.out.println("Using forEach");
        numbers.parallelStream().forEach(System.out::println);

    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
