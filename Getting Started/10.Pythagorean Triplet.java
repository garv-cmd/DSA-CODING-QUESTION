import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
        
        if (a*a == (b*b+c*c)){
            System.out.print("true");
        } 
        else{
             System.out.print("false");
        }
    }
    else if(b>c && b>a){
        
        if (b*b == (a*a+c*c)){
            System.out.print("true");
        } 
        else{
             System.out.print("false");
        }
    }
    else{
        if (c*c == (b*b+a*a)){
            System.out.print("true");
        } 
        else{
             System.out.print("false");
        }
    }
    
   }
  }
