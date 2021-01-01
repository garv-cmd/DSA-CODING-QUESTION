import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
     Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
    
           
      
        
            int power = 1;
            int temp = n;
            while(temp>=10){
                temp = temp/10;
                power = power*10;
            }
            temp = n;
            while(power!=0){
                int dig = temp/power;
                System.out.println(dig);
                temp = temp%power;
                power = power/10;
            }
      
     }
    }
