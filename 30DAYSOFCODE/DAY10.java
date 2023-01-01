/*
Problem Statement-[Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers/problem)               
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int r = n, c = 0, max= 0;      
        String s = "";
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                c++;
                if (c > max) {
                    max = c;
                }
            } else {
                c = 0;
            }
            s = r + s;
            n = n / 2;
        }
        System.out.println(max);
}
}

