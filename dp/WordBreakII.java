package algorithms.dp;

import java.util.*;

/**
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 *
 * 输入:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出:
 * [
 *   "cats and dog",
 *   "cat sand dog"
 * ]
 *
 * @author: shuo
 * @date: 2019/06/28
 */
public class WordBreakII {
    public static void main(String[] args) {
        String s =  "pineapplepenapple";
        List<String> list = new ArrayList();
        list.add("apple");
        list.add("pen");
        list.add("applepen");
        list.add("pine");
        list.add("pineapple");
        System.out.println(Arrays.toString(wordBreak(s, list).toArray()));
    }
    public static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet(wordDict);
        boolean[] keys = new boolean[s.length()];
        List<String> list = new ArrayList<>();
        find(list, s, keys, new StringBuilder(), set, 0);
        return list;
    }

    public static void find(List<String> list, String s, boolean[] keys, StringBuilder stringBuilder, Set<String> wordDict, int i)
    {
        String temp;
        for(int j = i; j < s.length(); j++)
        {
            if(keys[j])
            {
                continue;
            }
            temp = s.substring(i, j);
//            System.out.println(temp);
            if(wordDict.contains(temp))
            {
                System.out.println(temp);
                stringBuilder.append(temp).append(" ");
//                System.out.println(stringBuilder);
                keys[j] = true;
                if(j == s.length() - 1)
                {
                    list.add(stringBuilder.toString().trim());
                    return ;
                }
                find(list, s, keys, stringBuilder, wordDict, j + 1);
            }
        }
  }
}
