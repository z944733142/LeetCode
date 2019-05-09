package algorithms.dp;

/***
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 动态规划
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            return "";
        }
        int length = strs[0].length(), temp = 0;
        StringBuilder prefix = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            temp = 0;
            for (int j = 0; j < strs[i].length() && j < length && strs[i].charAt(j) == prefix.charAt(j); j++) {
                temp++;
            }
            length = Math.min(length, temp);
        }
        prefix = new StringBuilder(prefix.substring(0, length));
        return prefix.toString();
    }
}
