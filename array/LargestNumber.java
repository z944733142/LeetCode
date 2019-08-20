package algorithms.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 *
 * @author: shuo
 * @date: 2019/08/20
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integers[i] = nums[i];
        }
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o2.toString()+o1.toString()).compareTo(o1.toString() + o2.toString());
            }
        });
        StringBuilder s = new StringBuilder();
        for (Integer integer : integers) {
            s.append(integer);
        }
        while (s.length() > 1 && s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }
        return s.toString();
    }
}
