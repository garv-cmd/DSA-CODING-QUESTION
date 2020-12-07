public class HelloWorld{
        
      static String moveAllX(String S) {
        // code here
        if(S.length()==0 || S.length()==1)
        return S;
        char ch = S.charAt(0);
        String res = moveAllX(S.substring(1));
        if(ch=='x'){
            return res+ch;
        }else return ch+res;
       
    }
    
     public static void main(String []args){
       System.out.println(moveAllX("acbhsoiuxxouhuxubouxxouh"));
        
     }
}
