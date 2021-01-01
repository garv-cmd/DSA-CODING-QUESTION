import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b=1;
        int c=0;
        for(int i=0;i<n;i++){
            System.out.println(c);
           a=b;
           b=c;
           c=a+b;
           
            
        }
    }
}
