package String.WordBreak;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String str = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        // wordDict.add("sand");
        // wordDict.add("and");
        // wordDict.add("cat");

        // System.out.println(Arrays.toString(str.trim().split("pen")));
        // System.out.println(str.strip());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordDict.size(); i++) {
            if (str.contains(wordDict.get(i))) {
                sb.append(wordDict.get(i));
                if (i != 0) {
                    sb.append(" ");
                }
            } else {
                System.out.println(false);
            }

        }

        System.out.println(sb);
        String ans = sb.toString().trim();
        System.out.println(ans.length());
        System.out.println(str.length());
        System.out.println(ans.length() == str.length());

        // System.out.println(str.contains(wordDict.get(0)));

        // System.out.println(wordDict);

    }
}
