//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
class Majority
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int count = 0;
        int candidate = 0;
        for(int i=0;i<size;i++){
            if(count==0){
                candidate = a[i];
            }
            if(candidate==a[i])
            count++;
            else count--;
            
            
        }
        int c=0;
        for(int i:a){
            if(i==candidate)c++;
        }
        if(c>size/2)
        return candidate;
        else return -1;
    }
}
