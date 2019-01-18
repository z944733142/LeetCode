package Algorithms;

import java.util.HashMap;

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
            System.out.println(max + " " + i + " " + j);
        }
        return max;
    }

//    public int lengthOfLongestSubstring(String s) {
//        if(s == null)
//            return 0;
//        int start = 0;
//        int maxLen = 0;
//        for(int i = 0; i < s.length(); i++){
//            int j = start;
//            for(; j < i; j++){
//                if( s.charAt(j) == s.charAt(i)){
//                    break;
//                }
//            }
//            if(j < i){
//                start = j + 1;
//            }
//            else{
//                maxLen = Math.max(maxLen,i-start+1);
//            }
//        }
//        return maxLen;
//    }
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
