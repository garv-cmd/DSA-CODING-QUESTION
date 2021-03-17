//IB
public class Solution {
    public int solve(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        int root = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<root){
                return 0;
            }
            while(!st.isEmpty() && st.peek()<A.get(i)){
                root=st.peek();
                st.pop();
            }
            st.push(A.get(i));
        }
        return 1;
    }
}
