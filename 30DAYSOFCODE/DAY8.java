/*
Problem Statement-[Dictionaries and Maps](https://www.hackerrank.com/challenges/30-dictionaries-and-maps)
 */
 

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
           
        }
        while(in.hasNext()){
            String s = in.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));

            } else {
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}
