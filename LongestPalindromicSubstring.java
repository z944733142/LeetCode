package Algorithms;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
    }
    public String longestPalindrome(String s) {
        String str = new String();
        int max = 0;
        for(int i = 0, j = 0, k = 0; i < s.length(); i++)
        {
            while (j > 0 && k < s.length() - 1 && s.charAt(j) == s.charAt(k))
            {
                j--;
                k++;
            }
            System.out.println(j + " " + k + " " + i);
            if(i - j > max)
            {
                max = i - j;
                if(s.charAt(j) == s.charAt(k))
                {
                    str = s.substring(j , k + 1);
                }
                else if(j > k)
                {
                    str = s.substring(j + 1, k);
                }

            }
            k = i;
            while (j > 0 && k < s.length() - 1 && s.charAt(j) == s.charAt(k))
            {
                j--;
                k++;
            }
            System.out.println(j + " " + k + " " + i);
            if(i - j > max)
            {
                max = i - j;
                if(s.charAt(j) == s.charAt(k))
                {
                    str = s.substring(j , k + 1);
                }
                else if(j > k)
                {
                    str = s.substring(j + 1, k);
                }

            }
            j = k = i;
        }
        return str;
    }
}
