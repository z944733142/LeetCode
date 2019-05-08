package Algorithms;


import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("))))())()()(()"));
    }
    public static int longestValidParentheses(String s) {
        return Math.min(func(s, '(', ')'),func(new StringBuilder(s).reverse().toString(), ')', '('));
    }

    public static int func(String s, Character left, Character right)
    {
        int max = 0;
        int sum = 0;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(c.equals(left))
            {
                stack.push(left);
            }else if(c.equals(right))
            {
                if (!stack.empty() && stack.peek().equals(left))
                {
                    sum ++;
                    stack.pop();
                    max = Math.max(sum, max);
                }else
                {
                    sum = 0;
                }
            }

        }
        return max * 2 ;
    }
}
