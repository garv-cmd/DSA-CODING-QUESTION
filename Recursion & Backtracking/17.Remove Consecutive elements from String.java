public class HelloWorld{
        
      static String removeDups(String S) {
        // code here
        if(S.length()==0 || S.length()==1)
        return S;
        char ch = S.charAt(0);
        String res = removeDups(S.substring(1));
        if(ch==res.charAt(0)){
            return res;
        }else
        return (ch+res);
    }
    
     public static void main(String []args){
       System.out.println(removeDups("aaabbbcdeeff"));
        
     }
}
