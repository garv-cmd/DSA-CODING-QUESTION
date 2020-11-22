//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1#
//leetcode - 128
static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> set = new TreeSet<>();
	   for(int i=0;i<N;i++){
	       set.add(arr[i]);
	   }
	   int max=0,count=0;
	   Iterator it = set.iterator();
	   while (it.hasNext()) 
	   {
    int item = (int) it.next() + 1;
    if (set.contains(item)) {
    count++;
    } else {
    if (count > max)
    max = count;
    count = 0;
}
}
	   return max+1;
	}
