import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int a1[] = new int[n1];
    for(int i=0;i<n1;i++){
        a1[i] = sc.nextInt();
       
    }
    int n2 = sc.nextInt();
    int a2[] = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i] = sc.nextInt();
       
    }
    int res[] = new int[Math.max(n1,n2)];
    int c=0;
    int i = a1.length-1;
    int j = a2.length-1;
    int k = res.length-1;
    
    while(k>=0){
        int d = c;
        if(i>=0){
            d+=a1[i];
        }
        if(j>=0){
            d+=a2[j];
        }
        c=d/10;
        d = d%10;
        res[k] = d;
        i--;
        j--;
        k--;
    }
    if(c!=0){
        System.out.println(c);
    }
    for(int q:res){
        System.out.println(q);
    }
    
        
    
 }

}
