package algorithms.array;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
 *
 * 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
 *
 * @author: shuo
 * @date: 2019/08/06
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        s.search(new int[]{1, 3, 5}, 0);
    }
    public int findStart(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        if (nums[start] < nums[end]) {
            return 0;
        }
        while (end - start > 1)
        {
            mid = (end + start) / 2;
            if(nums[mid] > nums[start])
            {
                start = mid;
            }else {
                end = mid;
            }
        }
        return nums[start] > nums[end] ? end : start;
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0)
        {
            return -1;
        }
        int start = findStart(nums);
        int end = (start - 1 + nums.length) % nums.length;
        int mid;
        while ( (start + 1) % nums.length != end)
        {
            if(end < start)
            {
                mid = (end + start + nums.length ) / 2 % nums.length;
            }else
            {
                mid = (end + start )/ 2;
                    }
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] < target)
            {
                start = mid;
            }else {
                end = mid;
            }
        }
        return nums[start] == target ? start : nums[end] == target ? end : -1;
    }
}
