/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
*/
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int rb[] = new int[arr.length];//next smaller element on right
    Stack<Integer> stack = new Stack<>();
    stack.push(arr.length-1);
    rb[arr.length-1] = arr.length;
    
    for(int i=arr.length-2;i>=0;i--){
        while(stack.size()>0 && arr[i] <= arr[stack.peek()]){
            stack.pop();
        }
        if(stack.isEmpty()){
            rb[i] = arr.length;
        }else{
            rb[i] = stack.peek();
        }
        stack.push(i);
        
    }
    
       int lb[] = new int[arr.length];//next smaller element on left
    Stack<Integer> st = new Stack<>();
    st.push(0);
    lb[0] = -1;
    
    for(int i=1;i<arr.length;i++){
        while(st.size()>0 && arr[i] < arr[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            lb[i] = -1;
        }else{
            lb[i] = st.peek();
        }
        st.push(i);
        
    }
    
    
    
    
    
    int maxArea = 0;
    for(int i=0;i<arr.length;i++){
        int width = rb[i] - lb[i]-1;
        int height = arr[i];
        int area = height*width;
        if(area > maxArea)
        maxArea = area;
    }
    // code
    System.out.println(maxArea);
 }
}
