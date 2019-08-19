package algorithms.array;

/**
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * @author: shuo
 * @date: 2019/08/19
 */
public class FindFirstandLastPositionofElementinSortedArray {

    public int[] nums;
    public int[] res;
    public int target;

    public static void main(String[] args) {
        FindFirstandLastPositionofElementinSortedArray f = new FindFirstandLastPositionofElementinSortedArray();
        f.searchRange(new int[]{3, 3, 3}, 3);
        System.out.println(f.res[0] + " " + f.res[1]);
    }
    public int[] searchRange(int[] nums, int target) {
        this.res = new int[2];
        this.target = target;
        this.nums = nums;
        binSearch(0, nums.length - 1);
        binSearch(0, nums.length - 1);
        return res;
    }

    private void binSearch(int start, int end) {


        int index = (start + end) / 2;
        if (nums[index] == target) {
           res[0] = Math.min(res[0], index);
           res[1] = Math.max(res[1], index);
        }
        if(start == end)
        {
            return;
        }
        if (nums[index] < target || (index + 1 <= end && nums[index + 1] == target)) {
            binSearch(index + 1, end);
        }
        if(nums[index] > target || (index - 1 >= start && nums[index - 1] == target))
        {
            binSearch(start, index);
        }

    }
}
