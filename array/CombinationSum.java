package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    /*
    给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的数字可以无限制重复被选取。

说明：

所有数字（包括 target）都是正整数。
解集不能包含重复的组合。
示例 1:

输入: candidates = [2,3,6,7], target = 7,
所求解集为:
[
  [7],
  [2,2,3]
]
     */
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList();
        find(candidates, 0, 0, target,new ArrayList(), lists);
        return lists;
    }

    public void find (int [] candiates, int sum,int j,int target, List<Integer> list, List<List<Integer>> lists)
    {
        if(sum == target)
        {
            lists.add((List<Integer>) ((ArrayList)list).clone());
            return;
        }
        for(int i = j; i < candiates.length; i++)
        {
                sum += candiates[i];
                if(sum > target)
                {
                    return;
                }
                list.add(candiates[i]);
                for (Integer integer : list) {
                    System.out.print(integer);
                }
                System.out.println();
                find(candiates, sum, i,target, (List<Integer>)((ArrayList)list).clone(), lists);
                list.remove((Integer) candiates[i]);
                sum -= candiates[i];
        }
    }
    //    public list<list<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        list<list<Integer>> lists = new ArrayList<>();
//        find(candidates, 0, 0, target,new ArrayList<>(), lists);
//        return lists;
//    }
//
//    public void find (int [] candiates, int sum,int j,int target, list<Integer> list, list<list<Integer>> lists)
//    {
//        if(sum == target)
//        {
//            if(!lists.contains(list)) {
//                lists.add((list<Integer>) ((ArrayList) list).clone());
//            }
//            return;
//        }
//        for(int i = j; i < candiates.length; i++)
//        {
//                sum += candiates[i];
//                if(sum > target)
//                    return;
//                list.add(candiates[i]);
//                find(candiates, sum, i + 1,target, (list<Integer>)((ArrayList)list).clone(), lists);
//                list.remove((Integer) candiates[i]);
//                sum -= candiates[i];
//        }
//    }
}
