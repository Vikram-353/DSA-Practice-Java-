package Map.WeakHashmap;

import java.util.*;

public class WeakHashmap {
    public static void main(String[] args) {
        WeakHashMap<String, String> list = new WeakHashMap<>();
        writeMe(list);
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }
        System.out.println(list);

    }

    public static void writeMe(Map<String, String> list) {
        String k1 = new String("Ram");
        String k2 = new String("Shyam");
        list.put(k1, new String("ush"));
        list.put(k2, new String("iua"));
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Name:" + name;
    }

}