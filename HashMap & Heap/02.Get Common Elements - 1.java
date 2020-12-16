/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).
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
    
    HashMap<Integer,Boolean> hm = new HashMap<>();
    for(int i=0;i<n1;i++){
        int key = arr[i];
        if(hm.containsKey(key)){
            continue;
        }else{
            hm.put(key,true);
        }
    }
    for(int i=0;i<n2;i++){
        int key = brr[i];
        if(hm.containsKey(key)){
            System.out.println(key);
            hm.remove(key);
        }
    }
    
 }

}
