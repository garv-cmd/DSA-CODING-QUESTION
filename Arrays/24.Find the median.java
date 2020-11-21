//https://practice.geeksforgeeks.org/problems/find-the-median0527/1#
class Solution
{
    public int find_fact(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n=v.length;

    if(n%2!=0)
    return v[n/2];
    else
    return (v[n/2] + v[n/2-1])/2;
    }
}
