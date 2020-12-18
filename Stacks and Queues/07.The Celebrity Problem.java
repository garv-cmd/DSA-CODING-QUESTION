//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
class Solution { 
    int celebrity(int arr[][], int n){
    	// code here 
    	 Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
           st.push(i);
        }

        while(st.size() > 1){
           int i = st.pop();
           int j = st.pop();

           if(arr[i][j] == 1){
               st.push(j);
           } else {
            st.push(i);
           }
        }

        int pot = st.pop();
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
           if(i != pot){
              if(arr[i][pot] == 0 || arr[pot][i] == 1){
                 flag = false;
                 break;
              }
           }
        }

        if(flag){
           return pot;
        } else {
           return -1;
        }
    }
}
