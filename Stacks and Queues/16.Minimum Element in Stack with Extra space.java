https://practice.geeksforgeeks.org/problems/special-stack/1
class GfG{
    Stack<Integer> ss = new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	    if(ss.isEmpty() || ss.peek()>=a){
	        ss.push(a);
	    }
	}
	public int pop(Stack<Integer> s)
        {
            if(s.size()==0)
            return -1;
            int top = s.pop();
            if(top==ss.peek()){
                ss.pop();
            }
            return top;
	}
	public int min(Stack<Integer> s)
        {
           if(ss.isEmpty())
           return -1;
           return ss.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           else return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size()==0)
           return true;
           else return false;
	}
}
