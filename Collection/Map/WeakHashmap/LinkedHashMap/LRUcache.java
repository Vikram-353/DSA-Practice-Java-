package Map.WeakHashmap.LinkedHashMap;

import java.util.LinkedHashMap;

public class LRUcache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUcache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;

    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {

        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUcache<String, Integer> studentMap = new LRUcache<>(3);
        studentMap.put("Vikram", 23);
        studentMap.put("RA", 22);
        studentMap.put("ja", 231);
        studentMap.put("jake", 31);
        System.out.println(studentMap);
    }

}
