package algorithms.sort;

import com.sun.webkit.Timer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定
 * @author: shuo
 * @date: 2019/11/21
 */
public class StraightInsertionSort {

    public static void main(String[] args) {
        Integer a[] = new Integer[100];
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt();
        }
        straightInsertionSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }

//    public static<T> void straightInsertionSort(T[] a, Comparator comparator)
//    {
//        if(a.length <= 1)
//        {
//            return;
//        }
//
//        for(int i = 1; i < a.length; i++)
//        {
//            T temp = a[i];
//            for(int j = 0; j < i; j++) {
//                if (comparator.compare(a[j], temp) > 0) {
//                    System.arraycopy(a, j, a, j + 1, i - j );
//                    a[j] = temp;
//                    break;
//                }
//            }
//        }
//    }

    public static<T> void straightInsertionSort(T[] a, Comparator comparator)
    {
        if(a.length <= 1)
        {
            return;
        }
        for(int j, i = 1; i < a.length; i++)
        {
            T temp = a[i];
            for(j = i - 1; j >= 0; j--) {
                if (comparator.compare(a[j], temp) < 0) {
                    break;
                }
            }
            System.arraycopy(a, j + 1, a, j + 2, i - j - 1);
            a[j + 1] = temp;
        }
    }
}



