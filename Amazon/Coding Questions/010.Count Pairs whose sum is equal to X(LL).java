//https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
    
                              
      Integer count = 0;
Map<Integer, Boolean> map = new HashMap<>();

for(Integer data: head1)
map.put(data, true);

for(Integer data: head2)
if(map.containsKey(x - data))
count++;

return count;




        
    }
}
