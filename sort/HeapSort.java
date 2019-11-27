package algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 时间复杂度 O(nlogn)
 * 空间复杂度 O(1)
 * 不稳定
 * @author: shuo
 * @date: 2019/11/22
 */
public class HeapSort {

    public static void main(String[] args) {
        Integer a[] = new Integer[100];
        HeapSort h = new HeapSort();
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt() % 3000;
        }
        h.heapSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }
        Comparator c;
        public <T> void heapSort(T[] a, Comparator c)
        {
            this.c = c;
            for(int i = a.length / 2 - 1; i >=0; i--)
            {
                headAdjust(a, i, a.length);
            }

            for (int i = a.length - 1; i >= 0; i--)
            {
                T temp = a[0];
                a[0] = a[i];
                a[i] = temp;
                headAdjust(a, 0, i);
            }
        }

        private <T> void headAdjust(T[] a, int parent, int length)
        {
            T temp = a[parent];
            int child = parent * 2 + 1;
            while (child < length)
            {
                if(child + 1 < length && c.compare(a[child], a[child + 1]) < 0)
                {
                    child = child + 1;
                }
                if(c.compare(temp, a[child]) >= 0 )
                {
                    break;
                }
                a[parent] = a[child];
                parent = child;
                child = child * 2 + 1;
            }
            a[parent] = temp;
        }
}
