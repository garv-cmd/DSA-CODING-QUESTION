import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
    
    int tot = (int)Math.pow(2,size);
    
    for(int i=0;i<tot;i++){
    int dec = i;
    String res="";
        for(int j=arr.length-1;j>=0;j--){
            int r = dec%2;
            dec/=2;
            
            if(r==0){
                res = "-	"+res;
            }else{
                res=arr[j]+"	"+res;
            }
        }
        System.out.println(res);
    }
 }

}
