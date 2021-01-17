//Interview bit
public class Solution {
    public int[] getRow(int A) {
        int res[] = new int[A+1];
       A++;
       int C=1;
       int q=0;
        for (int i = 1; i <= A; i++)
        {
            res[q++] = C;
            C = C * (A - i) / i;
        }
        return res;
    }
}
