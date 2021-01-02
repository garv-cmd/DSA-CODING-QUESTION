import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        int temp = d;
       int res = 0;
       int c=0;
       while(temp!=0){
           int rem = temp%b;
           res+=rem*Math.pow(10,c);
           temp/=b;
           c++;
       }
       
    
        System.out.println(res);
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
         int temp = n1;
        int c=0,num1=0;
        while(temp!=0){
            int rem = temp%10;
            num1=num1+rem*(int)Math.pow(b,c++);
            temp/=10;
        }
        int temp2 = n2;
        int c2=0,num2=0;
        while(temp2!=0){
            int rem = temp2%10;
            num2=num2+rem*(int)Math.pow(b,c2++);
            temp2/=10;
        }
        int t= num1*num2;
        
       
       return t;
        
    }

}
