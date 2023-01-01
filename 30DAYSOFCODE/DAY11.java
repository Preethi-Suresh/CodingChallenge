/*
Problem Statement- [2D Arrays](https://www.hackerrank.com/challenges/30-2d-arrays/problem)               
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
    public static void main(String[] args)  {
      Scanner s = new Scanner(System.in);
        int arr[][] = new int[6][6];        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        s.close();        
        int sum = 0, max =Integer.MIN_VALUE;        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + 2) < 6 && (j + 2) < 6) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
