/*
1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.
*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    
    long os=1;
    long ob = 1;
    for(long i=2;i<=n;i++){
        long ns = os;
        long nb = ob;
        
        ns = ob;
        nb = ob+os;
        
        os = ns;
        ob = nb;
        
    }
    long total = os+ob;
    long res =total*total;
    System.out.println(res);
    
    }

}
