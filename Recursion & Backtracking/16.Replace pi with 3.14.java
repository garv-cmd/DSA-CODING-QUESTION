public class HelloWorld{
        
        static void replacePI(String s){
            if(s.length()==0)
            return;
            
            if(s.charAt(0)=='p' && s.charAt(1)=='i')
            {
            System.out.print("3.14");
            replacePI(s.substring(2));
                
            }else{
                 System.out.print(s.charAt(0));
            replacePI(s.substring(1));
            }
        }
    
     public static void main(String []args){
        String s= "pippxxpppipi";
        replacePI(s);
     }
}
