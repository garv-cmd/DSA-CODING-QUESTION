package Arrays;
//Kadane’s Algorithm -> Used to find Maximum sub-array sum
//Leetcode - 53
public class Q5 {
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = arr[0];
        int curr = arr[0];
        for(int i=1;i<arr.length;i++){
            if(curr >= 0){
                curr+=arr[i];
            }else{
                curr = arr[i];
            }
            if(curr > max)
                max = curr;
        }
        System.out.print(max);
    }
}
