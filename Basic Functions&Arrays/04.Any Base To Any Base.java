import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  b= scn.nextInt();
     
     int temp = n;
     int dec = 0;
     int c=0;
     while(temp!=0){
         int rem = temp%10;
         dec+=rem*Math.pow(sourceBase,c);
         temp/=10;
         c++;
     }
      temp = dec;
       int res = 0;
        c=0;
       while(temp!=0){
           int rem = temp%b;
           res+=rem*Math.pow(10,c);
           temp/=b;
           c++;
       }
       
      
     System.out.println(res);
   }   
  }
