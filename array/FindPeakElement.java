package algorithms.array;

/**
 * 峰值元素是指其值大于左右相邻值的元素。
 *
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 *
 * 你可以假设 nums[-1] = nums[n] = -∞。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1]
 * 输出: 2
 * 解释: 3 是峰值元素，你的函数应该返回其索引 2。
 * @author: shuo
 * @date: 2019/08/21
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
       int start = 0, end = nums.length - 1;
       while (start < end)
       {
           int mid = start + (end - start) / 2;
           // mid + 1不会越界 因为除法向左取整.
           if(nums[mid] < nums[mid + 1])
           {
               // 向右搜索时加一  因为除法向左取整.
               start = mid + 1;
           }else {
               end = mid;
           }
       }
       return start;
    }

//    public void binSearch(int[] nums, int start, int end)
//    {
//
//        int mid = (start + end) / 2;
//        System.out.println(mid);
//        if((mid + 1 >= nums.length || nums[mid] > nums[mid + 1]) && (mid - 1 < 0 || nums[mid - 1] < nums[mid]))
//        {
//            res = mid;
//            return;
//        }
//        if(start == end)
//        {
//            return;
//        }
//        if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
//            binSearch(nums, start, mid);
//        }else if(mid + 1 < nums.length && nums[mid] < nums[mid + 1]){
//        binSearch(nums, mid + 1, end);
//        }
//
//    }
}
