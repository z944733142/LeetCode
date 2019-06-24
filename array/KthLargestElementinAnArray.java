package algorithms.array;

import java.util.Arrays;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路: 快排
 * @author: shuo
 * @date: 2019/06/24
 */
public class KthLargestElementinAnArray {
    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
    }
    public static int findKthLargest(int[] nums, int k) {
        return quickFind(nums, k , 0, nums.length - 1);
    }

    public static int quickFind(int[] nums, int k, int start, int end)
    {
        int index = start, left = start + 1, right = end;
        while (left <= right)
        {
            while (right >= left && nums[index] > nums[right])
            {
                right--;
            }
            if(left <= right)
            {
                swap(nums, right, index);
                index = right--;
            }
            while (left <= right && nums[index] < nums[left])
            {
                left++;
            }
            if(left <= right) {
                swap(nums, left, index);
                index = left++;
            }
        }
        if (index < k - 1)
        {
            return quickFind(nums, k, index + 1, end);
        }else if(index > k - 1)
        {
            return quickFind(nums, k, start, index - 1);
        }else {
            System.out.println(nums[index]);
            return nums[index];
        }
    }

    public static void swap(int[] nums, int index1, int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
