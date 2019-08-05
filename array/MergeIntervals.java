package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 排序 数组
 *
 * @author: shuo
 * @date: 2019/07/25
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList();
        boolean key = false;
        for (int i = 0; i < intervals.length; i++) {
            if(i == intervals.length - 1 || intervals[i][1] < intervals[i + 1][0] )
            {
                System.out.println(intervals[i]);
                list.add(intervals[i]);
            }else {
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
                intervals[i + 1][0] = Math.min(intervals[i][0], intervals[i + 1][0]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
