package algorithms;
/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:

输入: 121
输出: true
示例 2:
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println("-121".equals("121-"));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(((Integer)x).toString());
        if(str.toString().equals(str.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}
