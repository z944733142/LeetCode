package algorithms.array;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 双指针
 * @author: shuo
 * @date: 2019/09/05
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int end = nums.length - 1;
            for (int j = i + 1; j < nums.length && j < end; ) {
                int val = nums[i] + nums[j] + nums[end] - target;
                if (sum > Math.abs(val)) {
                    sum = Math.abs(val);
                    ans = val + target;
                }
                if (val > 0) {
                    end--;
                } else if (val < 0) {
                    j++;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
