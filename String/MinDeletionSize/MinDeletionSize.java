package String.MinDeletionSize;

import java.util.ArrayList;
import java.util.Arrays;

public class MinDeletionSize {
    public static void main(String[] args) {
        String[] str = { "abc", "bce", "cae" };
        System.out.println(minDeletionSize(str));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        int l = strs[0].length();
        char[][] chList = new char[l][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                chList[j][i] = strs[i].charAt(j);
            }
        }

        for (char[] cs : chList) {
            if (!isSorted(cs)) {
                count++;
            }
        }

        return count;
    }

    static boolean isSorted(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] > ch[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
