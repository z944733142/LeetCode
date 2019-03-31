package Algorithms;

import java.util.HashMap;
/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abba");
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        for(int i = 0, j = 0; j < s.length(); j++)
        {
            if(hashMap.containsKey(s.charAt(j)))
            {
                i = Math.max(hashMap.get(s.charAt(j)) + 1, i);
            }
            max = Math.max(max, j - i + 1);
            hashMap.put(s.charAt(j), j);
        }
        return max;
    }
    // 滑动窗口 未优化  未一次跳过重复的关键字 而是挨个跳过 复杂度o(2n)
//    public int lengthOfLongestSubstring(String s) {
//        int max = 1, temp;
//        Set<Character> set = new HashSet<>();
//        if (s.length() == 0)
//            return 0;
//        set.add(s.charAt(0));
//        for(int start = 0, end = 1;end < s.length(); end++)
//        {
//            while (set.contains(s.charAt(end)))
//            {
//                set.remove(s.charAt(start));
//                start++;
//            }
//            set.add(s.charAt(end));
//            temp = end - start + 1;
//            if(temp > max)
//            {
//                max = temp;
//            }
//        }
//        return max;
//    }
}
