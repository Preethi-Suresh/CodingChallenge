/*
Problem [Sorting]-(https://www.hackerrank.com/challenges/30-sorting)
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
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int temp=0;
        int Count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Count++;   
                }
                
            }
            if(Count==0){
                break;
            }
        }
                System.out.println("Array is sorted in "+Count+" swaps.");
                System.out.println("First Element: "+arr[0]);
                System.out.println("Last Element: "+arr[arr.length-1]);
    }
}
