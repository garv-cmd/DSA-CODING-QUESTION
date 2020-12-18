//https://practice.geeksforgeeks.org/problems/number-following-a-pattern/0#
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   while(n--!=0){
    String str = sc.next();

    // code
    Stack<Integer> st = new Stack<>();

    int num = 1;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == 'D') {
        st.push(num);
        num++;
      } else {
        st.push(num);
        num++;
        
        while (st.size() > 0) {
          System.out.print(st.pop());
        }
      }
    }

    st.push(num);
    while (st.size() > 0) {
      System.out.print(st.pop());
    }
    System.out.println();
  }
  }
}
