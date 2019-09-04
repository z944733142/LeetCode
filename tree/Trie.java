package algorithms.tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 *
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *
 * 示例:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 *
 * @author: shuo
 * @date: 2019/09/02
 */
public class Trie {

    private TreeNode root;


    private static class TreeNode{
        private char c;
        private TreeNode[] chirld;
        private boolean isEnd;
        private static int initSize = 26;
        public TreeNode()
        {
            chirld = new TreeNode[initSize];
        }

        public boolean containsKey(char c)
        {
            return chirld[c - 'a'] != null;
        }

        public TreeNode put(char c)
        {
            return chirld[c - 'a'] = new TreeNode();
        }

        public TreeNode get(char c)
        {
            return chirld[c - 'a'];
        }


    }
    /** Initialize your data structure here. */
    public Trie() {
        root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TreeNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!current.containsKey(c))
            {
                current = current.put(c);
            }else {
                current = current.get(c);
            }
        }
        current.isEnd = true;
    }
    public TreeNode searchPrefix(String word)
    {
        TreeNode current = root;
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if(!current.containsKey(c))
            {
                return null;
            }
            current = current.get(c);
        }
        return current;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TreeNode node = searchPrefix(word);
        return node == null ? false : node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TreeNode node = searchPrefix(prefix);
        return node != null;
    }
}
