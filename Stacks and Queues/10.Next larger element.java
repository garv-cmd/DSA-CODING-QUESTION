//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
      
   long res[]= new long[n];
   res[n-1] = -1;
   
   Stack<Long> st = new Stack<>();
   st.push(arr[n-1]);
   for(int i=n-2;i>=0;i--){
       long num = (long)arr[i];
       while(st.size()>0 && num>=st.peek()){
           st.pop();
       }
       if(st.isEmpty()){
           res[i] = (long)-1;
       }else{
           res[i] =(long) st.peek();
       }
       st.push(num);
   }
   
   
   
   
   return res;
    }
