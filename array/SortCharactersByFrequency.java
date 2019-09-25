package algorithms.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 *
 * 示例 1:
 *
 * 输入:
 * "tree"
 *
 * 输出:
 * "eert"
 * @author: shuo
 * @date: 2019/09/24
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency s = new SortCharactersByFrequency();

        System.out.println(s.frequencySort("Aabb"));
    }
    public String frequencySort(String s) {

        int[] a = new int[200];
        int[] b = new int[200];
        for(int i = 0; i < s.length(); i++)
        {
            a[s.charAt(i) - ' '] ++;
        }
        for (int i = 0; i < 200; i++) {
            b[i] = i;
        }

        boolean ch = true;
        while (ch)
        {
            ch = false;
            for (int i = 0; i < 99; i++) {
                if(a[i] < a[i + 1])
                {
                    ch = true;
                    swap(a, i);
                    swap(b, i);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 200 ; i++) {
            for (int j = 0; j < a[i]; j++) {
                stringBuilder.append((char)(b[i] + 'A'));
            }
        }
        return stringBuilder.toString();
    }

    public void swap(int[] a, int i)
    {
        int temp = a[i];
        a[i]  = a[i + 1];
        a[i + 1] = temp;
    }
}
