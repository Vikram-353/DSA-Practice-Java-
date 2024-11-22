package Array_ArrayList;

import java.util.*;

public class SortString {
    public static void main(String[] args) {

        List<String> word = Arrays.asList("Apple", "Banana", "Cat");
        word.sort((a, b) -> a.length() - b.length());
        System.out.println("Word in Ascending order" + word);
        word.sort((a, b) -> b.length() - a.length());
        System.out.println("Word in Descending order" + word);

    }
}
