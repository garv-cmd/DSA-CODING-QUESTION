import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int temp = n;
        int c=0,num=0;
        while(temp!=0){
            int rem = temp%10;
            num=num+rem*(int)Math.pow(b,c++);
            temp/=10;
        }
        return num;
    }
}
