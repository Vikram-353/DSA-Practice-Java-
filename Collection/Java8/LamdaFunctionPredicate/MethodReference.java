package Java8.LamdaFunctionPredicate;

import java.util.*;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {

        // Method Reference
        List<String> name = Arrays.asList("A", "B", "C");
        name.forEach(System.out::println);// Here println method of System.out is run for all elements of name list.

        // Constructor reference
        List<MobilePhone> M = name.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(M);
    }
}

class MobilePhone {

    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}