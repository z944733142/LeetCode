package algorithms.array;

import java.util.*;

public class Main {
    private ArrayList<String> res = new ArrayList();
    private boolean[] key ;
    private String s;
    public static void main(String[] args) {
        Main m = new Main();
        m.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }


    public int maxArea(int[] height) {
        int left_max = height[0];
        int right_max = height[height.length - 1];
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j;)
        {
            System.out.println(left_max + " " + right_max);
            max = Math.max(max, Math.min(left_max, right_max) * (j - i));
            if(left_max < right_max)
            {
                while(i < j && left_max > height[++i]);
                left_max = height[i];
            }else
            {
                while(i < j && right_max > height[--j]);
                right_max = height[j];
            }
        }
        return max;
    }
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0)
        {
            return 1;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= 0)
            {
                nums[i] = nums.length + 1;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            int index = nums[i] < 0 ? -nums[i] : nums[i];
            if(index > 0 && index <= nums.length)
            {
                int  val = nums[index - 1];
                nums[index - 1] = val < 0 ? val : -val;
                if(val == 0)
                {
                    nums[index - 1] = 0;
                }
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                return i+1;
            }
        }
        return nums.length + 1;
    }
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> m = new HashMap();
        for(int i = 0; i < str.length(); i++)
        {
            Character c = str.charAt(i);
            m.put(c, (m.getOrDefault(c, 0).intValue() + 1));
        }
        for(int i = 0; i < str.length(); i++)
        {
            if(m.get(str.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}