package algorithms.array;

/**
 *
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
 * 请注意，它是排序后的第k小元素，而不是第k个元素。
 *
 *
 * @author: shuo
 * @date: 2019/09/19
 */
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int sum = 0;
        int left = matrix[0][0];
        int right = matrix[matrix.length][matrix[0].length];
        while (k != sum)
        {
            sum = 0;
            int mid = (left + right) / 2;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j] < mid)
                    {
                        sum++;
                    }
                }
            }
        }
        return 0;
}}
