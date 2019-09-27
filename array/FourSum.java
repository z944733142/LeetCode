package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * -2 -1 1 0 1 2
 * @author: shuo
 * @date: 2019/09/27
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1, l = nums.length - 1; k < l;) {
                    int val = nums[k] + nums[l] + nums[i] + nums[j];
                    if(val == target)
                    {
                        List list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        if(!lists.contains(list)) {
                            lists.add(list);
                        }
                        k++;
                        l--;
                    }else if (val < target)
                    {
                        k++;
                    }else
                    {
                        l--;
                    }
                }
            }
        }
        return lists;
    }
}
