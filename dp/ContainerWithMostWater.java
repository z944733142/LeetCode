package algorithms.dp;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int pre = 0;
        int last = height.length - 1;
        int max = 0;
        while (pre != last)
        {
            int value1 = height[pre];
            int value2 = height[last];
            max = Math.max(max, (last - pre) * Math.min(value2, value1));
            System.out.println(pre + " " + last + " " + value1 + " " + value2);
            if(value1 < value2)
            {
                pre++;
            }else
            {
                last--;
            }
        }
        return max;
    }
}
