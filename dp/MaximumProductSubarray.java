package algorithms.dp;

/**
 * @author: shuo
 * @date: 2019/05/09
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = 1, min = 1, m = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
            {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            m = Math.max(max, m);
        }
        return m;
    }
}

