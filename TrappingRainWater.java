package algorithms;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(a);
    }
    public static int trap(int[] height) {
        int high;
        int h[] = new int[height.length];
        int j;
        int sum = 0;
        for(int i = 0; i < height.length; i++)
        {
//            System.out.println("i = " + i);
            if(height[i] == 0)
                continue;
            high = height[i];
            for(j = i + 1; j < height.length; j++)
            {
//                System.out.println("j = " + j);
                if(height[j] == 0 || height[j] < high)
                    continue;
                if(height[j] >= high)
                {
                    for(int k = i + 1; k < j; k++)
                    {
//                        System.out.println("k = " + k);
                        h[k] =  high - height[k] ;
                    }
                    break;
                }

            }
            if(j != height.length)
                i = j - 1;
        }
        for(int i = height.length - 1; i >= 0 ; i--)
        {
//            System.out.println("i = " + i);
            if(height[i] == 0)
                continue;
            high = height[i];
            for(j = i - 1; j >= 0; j--)
            {
//                System.out.println("j = " + j);
                if(height[j] == 0 || height[j] < high)
                    continue;
                if(height[j] >= high)
                {
                    for(int k = i - 1; k > j; k--)
                    {
//                        System.out.println("k = " + k);
                        h[k] =  high - height[k] ;
                    }
                    break;
                }

            }
            if(j != height.length)
                i = j + 1;
        }


        for(int i = 0; i < h.length; i++)
        {
            sum += h[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(h));
        return sum;
    }
}
