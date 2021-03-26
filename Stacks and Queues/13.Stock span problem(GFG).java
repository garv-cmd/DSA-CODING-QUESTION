https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#
class Solution{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int ind[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                ind[i] = -1;
            }else if(!st.isEmpty() && price[st.peek()]>price[i]){
                ind[i] = st.peek();
            }else if( !st.isEmpty() && price[st.peek()]<=price[i]){
                while(!st.isEmpty() && price[st.peek()]<=price[i] ){
                    st.pop();
                }
                if(st.isEmpty()){
                    ind[i] = -1;
                }else{
                    ind[i] = st.peek();
                }
            }
            st.push(i);
        }
        
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = i-(ind[i]);
        }
        return res;
    }
    
}
