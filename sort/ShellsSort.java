package algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 时间复杂度O(nlogn)
 * 空间复杂度O(1)
 * 不稳定
 * @author: shuo
 * @date: 2019/11/23
 */
public class ShellsSort <T>{
    public static void main(String[] args) {
        Integer a[] = new Integer[100];
        ShellsSort q = new ShellsSort<Integer>();
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt() % 100;
        }
        q.shellsSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }

    public <T> void shellsSort (T[] array, Comparator c)
    {
        int gap = array.length / 2;
        while(gap >= 1)
        {
            for(int i = gap; i < array.length; i += 1)
            {
                T temp = array[i];
                int j;
                for (j = i - gap; j >= 0 && c.compare(temp, array[j]) < 0;  j -= gap) {
                    array[j + gap] = array[j];
                }
                array[j + gap] = temp;
            }
            gap = gap / 2;
        }

    }
}
