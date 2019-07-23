package algorithms.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：
 *
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 *示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 *
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 *
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 *
 * 思路: 记录数组减少重复回溯计算.
 * 注: 用substring比Stringbuilder效率高
 * @author: shuo
 * @date: 2019/06/26
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet(wordDict);
        boolean[] keys = new boolean[s.length()];
        return find(s, keys, set, 0);
    }

    public static boolean find(String s, boolean[] keys, Set<String> wordDict, int i)
    {

        for(int j = i; j < s.length(); j++)
        {
            if(keys[j])
            {
                continue;
            }
            if(wordDict.contains(s.substring(i, j)))
            {
                    keys[j] = true;
                    if(j == s.length() - 1)
                    {
                        return true;
                    }
                    if(find(s, keys, wordDict, j + 1))
                    {
                        return true;
                    }
            }
        }
        return false;
    }
}
