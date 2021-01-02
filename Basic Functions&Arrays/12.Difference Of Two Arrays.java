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
    int res[] = new int[n2];
    int c=0;
    int i = a1.length-1;
    int j = a2.length-1;
    int k = res.length-1;
    
    while(k>=0){
        int d =0;
        int a1v = i>=0?a1[i]:0;
        if(a2[j]+c >= a1v){
        d = a2[j]+c-a1v;
        c=0;
        }
        else{
            d = a2[j]+c+10-a1v;
            c=-1;
        }
        res[k] = d;
        i--;
        k--;
        j--;
    }
    
    int ind = 0;
    for(int q=0;q<a2.length;q++){
        if(res[q]==0){
            ind++;
        }
        else{
            break;
        }
    }
    while(ind < a2.length){
        System.out.println(res[ind]);
        ind++;
    }
 }

}
