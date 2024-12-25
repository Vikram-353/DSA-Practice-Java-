package Java8.LamdaFunctionPredicate;

import java.util.List;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class lamdaFunction {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello World");
        });
        t1.start();

        MathOperation math = (a, b) -> a + b;
        MathOperation math_minus = (a, b) -> a - b;
        MathOperation math_Mul = (a, b) -> a * b;

        System.out.println(math.operate(6, 7));
        System.out.println(math_minus.operate(6, 7));
        System.out.println(math_Mul.operate(6, 7));

        // Predicate
        // To Check the true Or false value in just one line
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(7));

        Predicate<String> isStartWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isEndWithA = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isEndWithA.and(isStartWithA);
        System.out.println(and.test("Ankit"));

        // Function--> It dose some work for us and returns the result

        // Function<Integer, Integer> doubleIt = x -> x * 2;
        UnaryOperator<Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> TripleIt = x -> x * 3;
        System.out.println(doubleIt.apply(6));
        System.out.println(doubleIt.andThen(TripleIt).apply(7));
        System.out.println(doubleIt.compose(TripleIt).apply(8));

        Function<Integer, Integer> identity = Function.identity();// returns the input as output
        System.out.println(identity.apply(7));

        // Consumer
        // It Takes Input but does not provide any optput

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(9);

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 4);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // BinaryOperatoer

        // BiConsumer

        // BiFunction

        // BiPredicate
    }

}

interface MathOperation {
    int operate(int a, int b);
}
