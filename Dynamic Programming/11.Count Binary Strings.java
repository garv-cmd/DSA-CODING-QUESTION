/*
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.
*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int oc0 = 1;
    int oc1 = 1;
    
    for(int i=2;i<=n;i++){
        int nc0 = oc0;
        int nc1 = oc1;
        
        nc0 = oc1;
        nc1 = oc0+oc1;
        
        oc0 = nc0;
        oc1 = nc1;
    }
    System.out.println(oc0+oc1);
 }

}
