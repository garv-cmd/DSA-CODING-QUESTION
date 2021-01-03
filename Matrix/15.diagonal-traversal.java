/*
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // diagonal traversal
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = i + g; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


}
