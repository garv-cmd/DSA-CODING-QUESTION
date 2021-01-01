import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int k = sc.nextInt();
     
     int nod = 0;
     int temp = num;
     while(temp!=0){
         temp/=10;
         nod++;
     }
     k = k%nod;
     if(k<0)
     k+=nod;
     
     int mult = 1;
     int div = 1;
     
     for(int i=1;i<=nod;i++){
         if(i<=k){
             div*=10;
         }else{
             mult*=10;
         }
     }
     int quo = num/div;
     int rem = num%div;
     
     int res = rem*mult+quo;
     System.out.println(res);
     
    }
   }
