/*

1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1  = sc.nextInt();
    int arr[] = new int[n1];
    for(int i=0;i<n1;i++)
    arr[i] = sc.nextInt();
    
        int n2  = sc.nextInt();
    int brr[] = new int[n2];
    for(int i=0;i<n2;i++)
    brr[i] = sc.nextInt();
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<n1;i++){
        int key = arr[i];
        if(hm.containsKey(key)){
            int count = hm.get(key);
            count++;
            hm.put(key,count);
            
        }else{
            hm.put(key,1);
        }
    }
    for(int i=0;i<n2;i++){
        int key = brr[i];
        if(hm.containsKey(key) && hm.get(key)>0){
            System.out.println(key);
            int count = hm.get(key);
            count--;
            hm.put(key,count);
            
        }
    }
 }

}
