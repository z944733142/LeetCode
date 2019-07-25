package array;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 *
 * @author: shuo
 * @date: 2019/07/25
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp;
        for (int i = 0; i <= nums.length; i++) {
            if(nums[i] == 0)
            {
                temp = nums[i];
                nums[i] = nums[start];
                nums[start++] = temp;
            }else if(nums[i] == 2 && i <= end)
            {
                temp = nums[i];
                nums[i] = nums[end];
                nums[end--] = temp;
            }
        }
    }
}
