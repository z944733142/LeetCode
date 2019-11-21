package algorithms.array;

import java.util.*;

public class Main {
    private ArrayList<String> res = new ArrayList();
    private boolean[] key ;
    private String s;
    public static void main(String[] args) {
        Main m = new Main();

    }

    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> m = new HashMap();
        for(int i = 0; i < str.length(); i++)
        {
            Character c = str.charAt(i);
            m.put(c, (m.getOrDefault(c, 0).intValue() + 1));
        }
        for(int i = 0; i < str.length(); i++)
        {
            if(m.get(str.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}