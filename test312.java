package algorithms;

import java.util.*;

public class test312 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String[] line = in.nextLine().split(",");
         int m = Integer.valueOf(line[0]);
         int k = Integer.valueOf(line[1]);
        System.out.println(calculate(m, k));
    }

    static int calculate(int m, int k) {
        int num[] = new int[m];
        for (int i = 0; i < 4; i++) {
            num[i] = i + 2;
        }
        for (int i = 4; i < m; i++) {
            num[i] = num[i - 2] + num[i - 3];
        }
        for (int i = 0; i < m; i++) {
            StringBuilder stringBuilder = new StringBuilder(new Integer(num[i]).toString());
            stringBuilder.reverse();
            Integer integer = new Integer(stringBuilder.toString());
            num[i] = integer;
            System.out.println(integer);
        }
        Arrays.sort(num);
        System.out.println(num);
        return num[k];
    }
}
