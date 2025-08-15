package String.CommonCode;

public class CommonCode {
    public static void main(String[] args) {
        String s1 = "HARRY";
        String s2 = "LALLY";
        CommonSubString(s1, s2);
        int a = -5;
        ++a;
        int d = a++;
        System.out.println(a);
        System.out.println(d);

    }

    public static void CommonSubString(String s1, String s2) {
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
