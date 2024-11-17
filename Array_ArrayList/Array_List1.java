package Array_ArrayList;

import java.util.*;

public class Array_List1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); // list[index]] will not work here
        }

        System.out.println(list);
        sc.close();
    }
}