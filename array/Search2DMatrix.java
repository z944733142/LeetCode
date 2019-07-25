package array;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *
 * @author: shuo
 * @date: 2019/07/25
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
        {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0, j = n; i < m && j >= 0;) {
            if(matrix[i][j] < target)
            {
                i++;
            }else if(matrix[i][j] > target)
            {
                j--;
            }else
            {
                return true;
            }
        }
        return false;
    }
}
