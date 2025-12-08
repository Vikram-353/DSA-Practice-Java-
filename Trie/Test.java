package Trie;

public class Test {
    public static void main(String[] args) {
        Trie node = new Trie();
        String[] words = { "apple", "app", "baby", "ball" };
        for (String word : words) {
            node.insert(word);
        }

        System.out.println(node.search("app"));
        System.out.println(node.startsWith("bt"));

    }

}
