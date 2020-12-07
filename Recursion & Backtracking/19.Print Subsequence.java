public class HelloWorld{
        
      static void subSec(String S,String ans) {
        // code here
        if(S.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch = S.charAt(0);
        String r = S.substring(1);
        subSec(r,ans);
        subSec(r,ans+ch);
       
       
    }
    
     public static void main(String []args){
       subSec("ABC","");
        
     }
}
