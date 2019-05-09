package algorithms;

/**
 * @author: shuo
 * @date: 2019/05/09
 */
public class HouseRobber2 {
    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     *
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
     *
     * 示例 1:
     *
     * 输入: [2,3,2]
     * 输出: 3
     * 解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
     * 示例 2:
     *
     * 输入: [1,2,3,1]
     * 输出: 4
     * 解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     * 动规
     * 拆分问题为  0 到 n - 1  和  1 到 n 的情况
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int[] nums2 = nums.clone();
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = Math.max(i - 1 < 0 ?  0 : nums[i - 1], i - 2 < 0 ? nums[i] : nums[i - 2] + nums[i]);
        }
        for (int i = 1; i < nums2.length; i++) {
            nums2[i] = Math.max(i - 1 <= 0 ?  0 :nums2[i - 1], i - 2 <= 0 ? nums2[i] : nums2[i - 2] + nums2[i]);
        }
        return nums.length == 0 ? 0 : nums.length == 1 ? nums[nums.length - 1] : Math.max(nums[nums.length - 2], nums2[nums2.length - 1]);
    }
}

