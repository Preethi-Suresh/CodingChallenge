/*
Problem Statement- [Let's Review](https://www.hackerrank.com/challenges/30-review-loop/problem) 
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str1 = "", str2 = "";
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            char[] c = input.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (j % 2 == 0) {
                    str1 = str1 + c[j];
                } else {
                    str2 = str2 + c[j];

                }
            }
            System.out.println(str1 + " " + str2);
            str1 = str2 = "";
        }
        sc.close();
    }
}
