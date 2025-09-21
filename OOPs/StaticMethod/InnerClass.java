package OOPs.StaticMethod;

public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Vikram");
        System.out.println(obj.toString());
    }
}
