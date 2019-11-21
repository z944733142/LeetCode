package algorithms.dp;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * <p>
 * 示例:
 * <p>
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 * <p>
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: shuo
 * @date: 2019/10/08
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] l = new int[nums.length];
        int index = 0;
        int length = 1;
        l[0] = nums[0];
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > l[index]) {
                l[++index] = nums[i];
                continue;
            } else {
                while (index >= 0 && l[index] > nums[i]) {
                    i--;
                }
                l[index] = nums[i];
            }
            max = Math.max(index, max);
        }
        return max;
    }
}
