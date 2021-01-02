import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int rv = 0;
        int carry = 0,i=0;
        while(n1>0 || n2>0 || carry>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1/=10;
            n2/=10;
            int sum = d1+d2+carry;
            int ad = sum%b;
            carry = sum/b;
            
            rv=rv+ad*(int)Math.pow(10,i++);
        }
        return rv;
    }
}
