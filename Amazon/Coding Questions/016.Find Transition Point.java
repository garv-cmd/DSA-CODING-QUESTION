//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon#
class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int l = 0, h = n-1;
    
    while(l <= h)
    {
        int mid = l + (h-l)/2;
        
        if(arr[mid] == 1 && (mid-1 < 0 || arr[mid-1] == 0))
        {
            return mid;
        }
        
        if(arr[mid] == 1)
        {
            h = mid-1;
        }
        else
        {
            l = mid+1;
        }
    }
    
    return -1;
    }
}
