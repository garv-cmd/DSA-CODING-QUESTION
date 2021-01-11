//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<k;i++){
          stack.push(q.remove());
          
      }
      
      Queue<Integer> q1 = new LinkedList<>();
      for(int i=0;i<k;i++){
          q1.add(stack.pop());
      }
      while(!q.isEmpty()){
          
          q1.add(q.remove());
      }
   
       return q1;
    }
  
}
