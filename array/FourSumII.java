package algorithms.array;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 *
 * @author: shuo
 * @date: 2019/09/26
 */
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map= new HashMap();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            {
                for (int j = 0; j < B.length; j++) {
                    int val = A[i] + B[j];
                    map.put(val, map.getOrDefault(val, 0) + 1);
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                int val = -(C[i] + D[j]);
                if(map.containsKey(val))
                {
                    sum += map.get(val);
                }
            }
        }
        return sum;
    }
}
