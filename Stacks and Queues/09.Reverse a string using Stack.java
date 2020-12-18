//https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
class Solution {
    
    public void reverse(String str){
       //your code here
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<str.length();i++){
           stack.push(str.charAt(i));
       }
       while(!stack.isEmpty()){
           System.out.print(stack.pop());
       }  
       System.out.println();
       }

}
