//https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
class Solution {
    boolean arraySortedOrNot(int[] a, int n) {
        // code here
        if (n == 1 || n == 0)
            return true;

        return a[n - 1] >= a[n - 2]
            && arraySortedOrNot(a, n - 1);
    }
}
