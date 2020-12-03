//https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1/?category[]=Arrays&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=1&sortBy=submissions&query=category[]Arrayscompany[]AmazonproblemStatusunsolvedproblemTypefunctionalpage1sortBysubmissions#
static int missingNumber(int arr[], int size)
    {
        Set <Integer> set = new HashSet <> ();
for (int i = 0; i < size; i++)
set.add(arr[i]);
int p = 1;
while (p <= size)
{
if (!set.contains(p))
return p;
p++;
}
return p;
        
        // Your code here
        // You can add utility functions (if required)
        
    }
