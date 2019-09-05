package algorithms.recursion;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 *
 * 暴力递归
 * @author: shuo
 * @date: 2019/09/05
 */
public class PerfectSquares {
    int res = Integer.MAX_VALUE;
    public int numSquares(int n) {
        func(n, 0);
        return res;
    }

    public void func(int n, int sum)
    {
        if(n == 0)
        {
            res = Math.min(res, sum);
            return;
        }
        int val1 = (int)Math.sqrt(n);
        for (int i = 1; i <= val1; i++)
        {
            int val = i * i;
            func(n % val, sum + n / val);
        }
    }
}
