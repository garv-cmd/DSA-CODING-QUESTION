//https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/?company[]=Amazon&company[]=Amazon&problemStatus=unsolved&page=1&sortBy=submissions&query=company[]AmazonproblemStatusunsolvedpage1sortBysubmissionscompany[]Amazon
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
        String s = "";
        Node temp = head;
        while(temp!=null){
            s+=temp.data;
            temp = temp.next;
        }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }    
}
