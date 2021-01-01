import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();
        while(n--!=0){
            int x = sc.nextInt();
            int count = 0;
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    count++;
                    break;
                }
            }
            if(count==0)
            System.out.println("prime");
            else 
            System.out.println("not prime");
        }

    }
}
