package Recursion;

public class MissingLetter {
    public static void main(String[] args) {
        String a = "baccad";
        Find("", a);

    }

    static void Find(String answer, String s) {
        if (s.isEmpty()) {
            System.out.println(answer);
            return;

        }
        char a = s.charAt(0);
        if (a == 'a') {
            Find(answer, s.substring(1));
        } else {
            Find(answer + a, s.substring(1));
        }

    }

}
