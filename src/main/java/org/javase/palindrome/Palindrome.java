package org.javase.palindrome;


public class Palindrome {
    public static void main(String[] args) {
        String s = "ABCBA";
        isPalindorme(s);
    }

    /**
     * 给定一个字符串，判断是不是回文数
     * 回文数：左右对称 ，如A ,AA,ABA,ABBA,ABCBA等等都是回文数
     * 思路：
     * ABCBA =n
     * 01234
     * [0]=[4],[1]=[3] 总结规律： 第i项= n-1-i
     * 以n/2为中心去判断
     * * @param s
     */
    public static void isPalindorme(String s) {
        int n = s.length();
        System.out.println(n);
        if (n == 0) {
            System.out.println("空字符串，不是回文！");
        } else {
            for (int i = 0; i <= n/2; i++) {
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    if (n / 2 == i) {
                        System.out.println(s + "是回文数");
                    }
                } else {
                    System.out.println(s + "不是回文数");
                    break;
                }
            }
        }
    }
}
