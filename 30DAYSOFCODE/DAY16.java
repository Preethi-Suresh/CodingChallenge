/*
Problem Statement-[Exceptions - String to Integer](https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem)
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int i = 0;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
