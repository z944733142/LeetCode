package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 *
 * 双指针
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * @author: shuo
 * @date: 2019/06/03
 */
public class ThreeSum {

    /**
     * 超时  时间复杂度O(n^2)  其中一次遍历需要改为哈希
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length < 3)
        {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1, k = nums.length - 1 ;j < k;)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                {
                    k--;
                }else if(sum < 0)
                {
                    j++;
                }else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if(!lists.contains(list)) {
                        lists.add(list);
                    }
                    if(sum < 0) {
                        break;
                    }
                    k--;
                }
            }
        }
        return lists;
    }
}
