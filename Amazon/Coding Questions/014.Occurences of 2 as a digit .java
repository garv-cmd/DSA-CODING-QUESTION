//https://practice.geeksforgeeks.org/problems/occurences-of-2-as-a-digit/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class GfG
{
    public static long count2s(long n)
    {
        // Your code here
      long c=0;
        
        for(long j=0;j<=n;j++)
        {
            String str= Long.toString(j);
            for(int i=0;i<str.length();i++) {if(str.charAt(i)=='2') c++;}
        }
        return c;
    }
    
    
}
