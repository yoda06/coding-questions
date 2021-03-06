/*
    You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
    Given n, find the total number of full staircase rows that can be formed.
    n is a non-negative integer and fits within the range of a 32-bit signed integer.

    Example 1:
    n = 5
    The coins can form the following rows:
    ¤
    ¤ ¤
    ¤ ¤
    Because the 3rd row is incomplete, we return 2.

    Example 2:
    n = 8
    The coins can form the following rows:
    ¤
    ¤ ¤
    ¤ ¤ ¤
    ¤ ¤
    Because the 4th row is incomplete, we return 3.
 */

package com.ques.leetcode;

public class ArrangingCoins {

    public static void main(String[] args) {

        System.out.println(arrangeCoins(25));
    }

    public static int arrangeCoins(int n) {
        int i=1,sum=0;

        if(n==0)
            return 0;
        else{
            for(;i<=n;n-=i,i++);
            return i>1?i-1:1;
        }
    }
}
