package algorithms.map;

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
    public List<List<Integer>> permute(int[] nums) {
        boolean status[] = new boolean[nums.length];
        List<List<Integer>> lists = new LinkedList<>();
        DFS(status, nums, lists, new LinkedList<Integer>(), 0);
        return lists;
    }

    public void DFS(boolean[] status, int[] nums, List<List<Integer>> Lists, List<Integer> list, int i)
    {
        for (boolean b : status) {
            if(b == false)
            {

            }
        }

    }
}
