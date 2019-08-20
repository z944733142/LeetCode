package algorithms.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shuo
 * @date: 2019/08/20
 */
public class GenerateParentheses {

    List<String> res = new ArrayList<>();
    int length;
    public List<String> generateParenthesis(int n) {
        length = n;
         DFS(new String(),n * 2, 0);
         return res;
    }

    public void DFS(String s, int n, int left)
    {
        System.out.println(s);
        System.out.println(left + " " + length);
        if(n == 0)
        {
            res.add(s);
            return;
        }
        if(left > 0)
        {
            DFS(s + ")", n - 1, left - 1);
        }
        if(left < n) {
            DFS(s + "(", n - 1, left + 1);
        }
    }

}
