import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int temp = n;
     
     while(temp!=0){
         int rem = temp%10;
         System.out.println(rem);
         temp/=10;
     }
     
    }
   }
