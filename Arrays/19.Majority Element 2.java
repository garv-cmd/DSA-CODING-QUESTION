//Leetcode - 229
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,c1=0,c2=0,len=nums.length;
        for(int num:nums){
            if(num==num1){
                c1++;
                
            }else if(num==num2){
                c2++;
            }
            else if(c1==0){
                num1 = num;
                c1=1;
                
            }else if(c2==0){
                num2 = num;
                c2=1;
                
            }else{
                c1--;
                c2--;
            }
            
        }
        ArrayList<Integer> list = new ArrayList<>();
        int a=0,b=0;
        for(int num:nums){
            if(num==num1){
                a++;
            }
            else if(num==num2)
            {
                b++;
            }
        }
       
        if(a>len/3){
            list.add(num1);
        }
        if(b>len/3)
            list.add(num2);
        return list;
        
    }
}
