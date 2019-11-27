package algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *  时间复杂度 O(nlogn)
 *  空间复杂度 O(1)
 *  不稳定
 * @author: shuo
 * @date: 2019/11/22
 */
public class QuickSort<T> {

    public static void main(String[] args) {
        Integer a[] = new Integer[100];
        QuickSort q = new QuickSort<Integer>();
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt() % 100;
        }
        q.quickSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }
    T[] array;
    Comparator c;

    public void quickSort(T[] a, Comparator c)
    {
        this.array = a;
        this.c = c;
        quickSort(0, a.length - 1);
    }

    private  void quickSort(int start, int end)
    {
        if(start < end) {
            int mid = divide(start, end);
            quickSort(start, mid - 1);
            quickSort(mid + 1, end);
        }
    }

    private  int divide(int start, int end)
    {
        T temp = array[start];
        while (start < end)
        {
            while (c.compare(temp, array[end]) < 0)
            {
                end--;
            }
            array[start] = array[end];
            while ( c.compare(array[start], temp) < 0)
            {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = temp;
        return start;
    }


}
