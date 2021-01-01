import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rem = 0;
    int c = 0;
    while(num!=0){
        
         rem = num%10;
         c++;
         num/=10;
         
         
    }
    System.out.println(c);
   }
  }
