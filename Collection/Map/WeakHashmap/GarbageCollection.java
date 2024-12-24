package Map.WeakHashmap;

import java.lang.ref.WeakReference;

public class GarbageCollection {
    public static void main(String[] args) {
        // Person Apple = new Person("Apple", "16 Pro max");
        // Apple = null;

        WeakReference<Person> Apple = new WeakReference<>(new Person("Apple", "16 Pro max"));
        System.out.println(Apple.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception elunMusk) {

        }

        System.out.println(Apple.get());

    }

}

class Person {

    String name;
    String Brand;

    public Person(String name, String brand) {
        this.name = name;
        this.Brand = brand;
    }

    @Override
    public String toString() {

        return "Person{name='" + name + "', brand='" + Brand + "'}";
    }

}
