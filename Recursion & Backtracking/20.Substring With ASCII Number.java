public class HelloWorld{
        
      static void subSecASCII(String S,String ans) {
        // code here
        if(S.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch = S.charAt(0);
        int code = ch;
        String r = S.substring(1);
        subSecASCII(r,ans);
        subSecASCII(r,ans+ch);
        subSecASCII(r,ans+""+code);
       
       
       
    }
    
     public static void main(String []args){
       subSecASCII("AB","");
        
     }
}
