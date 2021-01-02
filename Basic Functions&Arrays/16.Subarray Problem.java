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

    for(int i=0;i<n1;i++){
        for(int j=i;j<n1;j++){
            for(int k=i;k<=j;k++){
                System.out.print(a1[k]+"	");
            }
            System.out.println();
        }
    }
    
 }

}
