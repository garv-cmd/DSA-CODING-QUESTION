//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int hash[] = new int[100000];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int mis = 0;
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                mis = i;
                break;
            }
        }
        int rep = 0;
        for(int i=1;i<=n;i++){
            if(hash[i]>1){
                rep = i;
                break;
            }
        }
        return new int[]{rep,mis};
    }
}
