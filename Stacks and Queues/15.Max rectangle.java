https://practice.geeksforgeeks.org/problems/max-rectangle/1//
class Solution {
    public int maxArea(int M[][], int n, int m) {
        int max = Integer.MIN_VALUE;
         int arr[] = new int[m];
       
            for(int j=0;j<m;j++){
                arr[j] = M[0][j];
            }
            
            int a = largestRectangleArea(arr);
         
            max = Math.max(a,max);
        
        for(int i=1;i<n;i++){
           
            for(int j=0;j<m;j++){
                if(M[i][j]==0){
                    arr[j]=0;
                }else{
                    arr[j]+=1;
                }
            }
            
            int area = largestRectangleArea(arr);
           // System.out.println(area);
            max = Math.max(area,max);
        }
        return max;
    }
    public int largestRectangleArea(int[] hist) {
       int res=0;
        int n = hist.length;
        int left[] = new int[n];
        Stack<Integer>l = new Stack<>();
        for(int i=0;i<n;i++){
            if(l.isEmpty()){
                left[i] = -1;
                
            }else if(!l.isEmpty() && hist[l.peek()] < hist[i] ){
                left[i] = l.peek();
            }else if( !l.isEmpty() && hist[l.peek()] >= hist[i] ){
                while(!l.isEmpty() && hist[l.peek()] >= hist[i]){
                    l.pop();
                }
                if(l.isEmpty()){
                    left[i] = -1;
                }else{
                    left[i] = l.peek();
                }
            }
            l.push(i);
        }
        
        int right[] = new int[n];
        Stack<Integer>r = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(r.isEmpty()){
                right[i] = n;
                
            }else if(!r.isEmpty() && hist[r.peek()] <= hist[i] ){
                right[i] = r.peek();
            }else if( !r.isEmpty() && hist[r.peek()] > hist[i] ){
                while(!r.isEmpty() && hist[r.peek()] > hist[i]){
                    r.pop();
                }
                if(r.isEmpty()){
                    // System.out.print("hey");
                    right[i] = n;
                }else{
                    right[i] = r.peek();
                }
            }
            r.push(i);
        }
         
        int area[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int hd = right[i]-left[i]-1;
            area[i] = hist[i]*hd;
            if(area[i] > max)
                max = area[i];
        }
    
        //int area[] = new int[n];
        
        return max;
    }
}
