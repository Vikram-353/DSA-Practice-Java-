package String.Versions;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareVersion {
    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.0001";
        System.out.println(compareVersion(version1, version2));

    }

    public static int compareVersion(String version1, String version2) {
        ArrayList<String> str1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));
        if (str1.size() < str2.size()) {
            for (int i = str1.size(); i < str2.size(); i++) {
                str1.add("0");
            }
        }
        if (str1.size() > str2.size()) {
            for (int i = str2.size(); i < str1.size(); i++) {
                str2.add("0");
            }
        }

        for (int i = 0; i < str1.size(); i++) {
            if (Integer.parseInt(str1.get(i)) < Integer.parseInt(str2.get(i))) {
                return -1;
            } else if (Integer.parseInt(str1.get(i)) > Integer.parseInt(str2.get(i))) {
                return 1;
            }
        }

        return 0;

    }
}
