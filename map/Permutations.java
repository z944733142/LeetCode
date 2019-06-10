package algorithms.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 *
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * @author: shuo
 * @date: 2019/05/28
 */
public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        boolean status[] = new boolean[nums.length];
        List<List<Integer>> lists = new LinkedList<>();
        DFS(status, nums, lists, new LinkedList<Integer>());
        return lists;
    }

    public static void DFS(boolean[] status, int[] nums, List<List<Integer>> lists, List<Integer> list){
        List list1 = new ArrayList(list);
        for (int j = 0; j < status.length; j++) {
            if(!status[j])
            {
                status[j] = true;
                list1.add(nums[j]);
                DFS(status, nums, lists, list1);
                status[j] = false;
                if(list1.size() == nums.length)
                {
                    lists.add(list1);
                    return;
                }
                list1.remove(list1.remove(list1.size() - 1));
            }
        }

    }
}
