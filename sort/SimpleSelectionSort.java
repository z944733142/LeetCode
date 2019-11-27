package algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 不稳定
 * @author: shuo
 * @date: 2019/11/21
 */
public class SimpleSelectionSort {

    public static void main(String[] args) {
        Integer a[] = new Integer[5];
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt();
        }
        simpleSelectionSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }
    public  static <T> void  simpleSelectionSort(T[] a, Comparator comparator)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if(comparator.compare(a[index], a[j]) > 0)
                {
                    index = j;
                }
            }
            T temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
