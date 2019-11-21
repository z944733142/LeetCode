package algorithms.dp;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 问总共有多少条不同的路径？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *  动规
 *  排列组合 总步数一定, 选取其中几步走下, 则确定一条路径
 * @author: shuo
 * @date: 2019/11/21
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] num = new int[n][m];
        for(int i = 0; i < m; i++)
        {
            num[0][i] = 1;
        }
        for(int i = 0; i < n; i++)
        {
            num[i][0] = 1;
        }
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j < m; j++)
            {
                num[i][j] = num[i - 1][j] + num[i][j - 1];
            }
        }
        return num[n - 1][m - 1];
    }
}
