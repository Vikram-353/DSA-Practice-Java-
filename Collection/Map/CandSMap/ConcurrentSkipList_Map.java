package Map.CandSMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipList_Map {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> list = new ConcurrentSkipListMap<>();
        list.put(1, "rt");
        list.put(2, "ram");
        list.put(2, "shyam");
        System.out.println(list);
    }
}
