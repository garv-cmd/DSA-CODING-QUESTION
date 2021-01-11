https://practice.geeksforgeeks.org/problems/queue-reversal/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stack = new Stack<>();
        stack.addAll(q);
        Queue<Integer> que = new LinkedList<>();
        while(!stack.isEmpty()){
            que.add(stack.pop());
        }
        return que;
        
        
        
        
    }
}
