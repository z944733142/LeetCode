package algorithms;

import java.util.*;

/*
给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

示例:

输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String, List> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] c= strs[i].toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(!map.containsKey(str))
            {
                map.put(str, new ArrayList());
            }
            map.get(str).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
