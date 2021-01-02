import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int temp = n;
       int res = 0;
       int c=0;
       while(temp!=0){
           int rem = temp%b;
           res+=rem*Math.pow(10,c);
           temp/=b;
           c++;
       }
       
       return res;
   }
  }
