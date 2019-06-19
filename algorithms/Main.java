package algorithms.algorithms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 1000; i++) {
            set.add(i*i / 7);
            System.out.println(i*i / 7);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
