leetcode - 1047
  class Solution {
    public String removeDuplicates(String S) {
          Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++){
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        for(Character c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
