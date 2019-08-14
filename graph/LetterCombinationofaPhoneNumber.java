package algorithms.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * @author: shuo
 * @date: 2019/07/22
 */
public class LetterCombinationofaPhoneNumber {
    private static Map<String, String> phone;
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList();
        if(digits.equals(""))
        {
            return list;
        }
        phone = new HashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};
        dfs(list, digits, new StringBuilder(), 0);
        return list;
    }

    public void dfs(List<String> list, String digits, StringBuilder s, int index)
    {
        if(index == digits.length())
        {
            list.add(s.toString());
            return ;
        }
        String str = phone.get(digits.substring(index, index + 1));
        for (int i = 0; i < str.length(); i++) {
            dfs(list, digits, s.append(str.charAt(i)), index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
