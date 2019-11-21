package algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * @author: shuo
 * @date: 2019/11/21
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer a[] = new Integer[5];
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt();
        }
        bubbleSort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }

    public static <T> void bubbleSort(T a[], Comparator c)
    {
        boolean ch = true;
        while (ch)
        {
            ch = false;
            for (int i = 0; i < a.length - 1; i++) {
                if(c.compare(a[i], a[i + 1]) > 0)
                {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ch = true;
                }
            }
        }
    }
}
