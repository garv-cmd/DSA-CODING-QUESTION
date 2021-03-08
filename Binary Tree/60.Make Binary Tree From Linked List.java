//https://practice.geeksforgeeks.org/problems/make-binary-tree/1
class GfG {
    public static Tree convert(Node head, Tree node) {
        ArrayList<Tree>al = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            al.add(new Tree(temp.data));
            temp = temp.next;
        }
        int n = al.size();
        int val=n/2;
        if(n%2!=0){
            val = n/2+1;
        }
        for(int i=0;i<val;i++){
            if(2*i+1<n){
                Tree t1 = al.get(i);
                t1.left = al.get(2*i+1);
            }
            if(2*i+2<n){
                Tree t1 = al.get(i);
                t1.right = al.get(2*i+2);
            }
        }
        return al.get(0);
        
    }
}  
