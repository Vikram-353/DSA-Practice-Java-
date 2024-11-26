package CopyOnWrteArrayList;

// import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArray {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        // List<String> list = new ArrayList<>();//throws ChechForCoModification Error
        list.add("Apple");
        list.add("Bnanana");
        list.add("Me");
        for (String string : list) {
            System.out.println(string);

            if (string == "Bnanana") {
                list.add("MILK");
                System.out.println("Milk added in list");
            }
        }
        System.out.println(list);
    }
}
