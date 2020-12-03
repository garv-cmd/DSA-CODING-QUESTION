//
//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/?category[]=Arrays&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=1&sortBy=submissions&query=category[]Arrayscompany[]AmazonproblemStatusunsolvedproblemTypefunctionalpage1sortBysubmissions
int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max = i+1;
            }else{
              if(map.get(sum)!=null){
                  max = Math.max(max,i-map.get(sum));
              }else{
                  map.put(sum,i);
              }
            }
        }
        return max;
    }
