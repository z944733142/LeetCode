package algorithms.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 * @author: shuo
 * @date: 2019/06/19
 */
public class Permutations2 {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{2, 2, 1, 1}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        boolean status[] = new boolean[nums.length];
        List<List<Integer>> lists = new LinkedList();
        DFS(status, nums, lists, new LinkedList<Integer>());
        return lists;
    }

    public static void DFS(boolean[] status, int[] nums, List<List<Integer>> lists, List<Integer> list){

        for (int j = 0; j < status.length; j++) {
            if(!status[j])
            {
                status[j] = true;
                int size = list.size();
                list.add(size, nums[j]);
                DFS(status, nums, lists, list);
                if(list.size() == nums.length && !lists.contains(list))
                {

                    lists.add(new ArrayList(list));
//                    return;
                }
                list.remove(size);
                status[j] = false;
            }
        }

    }
}
