/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a wave - down the first column then up the second column and so on.
*/


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int a1[][] = new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a1[i][j] = sc.nextInt();
        }
    }
    
    for(int i=0;i<a1[0].length;i++){
        if(i%2==0){
            for(int j=0;j<a1.length;j++){
                System.out.println(a1[j][i]);
            }
        }else{
            for(int j=a1.length-1;j>=0;j--){
                System.out.println(a1[j][i]);
            }
            
        }
    }
    
 }

}
