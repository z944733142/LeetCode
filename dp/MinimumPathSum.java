package algorithms.dp;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * 思路1.0: 动态规划建立每个点的最短路径, 减少多余的路径搜索.
 * @author: shuo
 * @date: 2019/06/03
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] gird = {
                {1, 100, 100, 100, 100},
                {1, 100, 100, 100, 100},
                {1, 100, 100, 100, 100},
                {1, 100, 1, 1, 1},
                {1, 1, 1, 100, 1}
        };
        System.out.println(minPathSum(gird));
    }

    public static int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if (j - 1 < 0 && i - 1 < 0){
                    continue;
                }
                if (i - 1 < 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (j - 1 < 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                }  else {
                    grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) + grid[i][j];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
