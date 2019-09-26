package algorithms.array;

/**
 打乱一个没有重复元素的数组。

 示例:

 // 以数字集合 1, 2 和 3 初始化数组。
 int[] nums = {1,2,3};
 Solution solution = new Solution(nums);

 // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 solution.shuffle();

 // 重设数组到它的初始状态[1,2,3]。
 solution.reset();

 // 随机返回数组[1,2,3]打乱后的结果。
 solution.shuffle();

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/shuffle-an-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: shuo
 * @date: 2019/09/26
 */
public class ShuffleanArray {
    int[] nums;

    public ShuffleanArray(int[] nums) {
        this.nums = nums;
    }

//    public Solution(int[] nums) {
//
//    }
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] nums2 = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            swap(nums2, i, (int)(Math.random() * (nums.length - i) + i));
        }
        return nums2;
    }

    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
