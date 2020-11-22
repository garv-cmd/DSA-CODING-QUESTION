//leetcode - 152
class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        if(arr.length==0)
        return 0;
        if(arr.length==1)
        return arr[0];
        int maxProduct=0,currProduct=1;
        for(int i=0;i<n;i++){
            currProduct = currProduct*arr[i];
            maxProduct = Math.max(maxProduct,currProduct);
            if(currProduct==0)
            currProduct=1;
        }
          currProduct=1;
         for(int i=n-1;i>=0;i--){
            currProduct = currProduct*arr[i];
            maxProduct = Math.max(maxProduct,currProduct);
            if(currProduct==0)
            currProduct=1;
        }
        return maxProduct;
    }
}
