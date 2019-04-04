package Algorithms;

/*
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        lists.add(new LinkedList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new LinkedList<List<Integer>>();
            for (List<Integer> integers : lists) {
                List<Integer> list1 = new LinkedList<>(integers);
                temp.add(list1);
                integers.add(nums[i]);
            }
            lists.addAll(temp);
        }
        return lists;
    }
}
