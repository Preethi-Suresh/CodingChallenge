/*
Problem Statement-[Scope](https://www.hackerrank.com/challenges/30-scope/problem)   
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
     
Difference(int [] elements){
    this.elements=elements;
}
    
 void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;
        for (int i = 1; i < elements.length; i++) {
            
            maxNum=elements[i]>maxNum?elements[i]:maxNum;
            minNum=elements[i]>minNum?minNum:elements[i];
            
        }
        maximumDifference=Math.abs(maxNum-minNum);
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
