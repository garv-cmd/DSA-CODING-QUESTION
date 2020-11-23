//https://practice.geeksforgeeks.org/problems/common-elements1132/1#
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
       
        Set<Integer> set = new LinkedHashSet<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                set.add(A[i]);
                i++;
                j++;
                k++;
            }else if(A[i]<B[j]){
                i++;
            }else if(B[j]<C[k]){
                j++;
            }else k++;
        }
         ArrayList<Integer> list = new ArrayList<>(set);
        
        if(list.size()==0)
        list.add(-1);
        return list;
        
    }
}
