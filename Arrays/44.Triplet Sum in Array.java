//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1/?company[]=OYO%20Rooms&company[]=OYO%20Rooms&page=1&query=company[]OYO%20Roomspage1company[]OYO%20Rooms#
class TripletSum
{
    // arr[] : The input Array
    // N : Size of the Array
    // X : Sum which you need to search for 
    
    public static int find3Numbers(int arr[], int N, int X) { 
    Arrays.sort(arr);
       for(int i=0;i<N;i++){
           int num = arr[i];
           int target = X-num;
           boolean rest = check(i,arr,target);
           if(rest){
               return 1;
           }
       }
       return 0;
    
    }
    
    public static boolean check(int start,int arr[],int target){
        int low = start;
        int high = arr.length-1;
        while(low<high){
            
            if(arr[low]+arr[high]>target){
                high--;
            }else if(arr[low]+arr[high]<target){
                low++;
            }else{
                return true;
            }
        }
        return false;
    }
}
