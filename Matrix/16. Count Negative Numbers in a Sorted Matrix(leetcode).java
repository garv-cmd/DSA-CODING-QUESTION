leetcode - 1351
  class Solution {
    public int countNegatives(int[][] grid) {
       int c=0;
        int a = grid.length;
        int b = grid[0].length;
        for(int i=0;i<a;i++){
        for(int j=b-1;j>=0;j--){
            if(grid[i][j] < 0)
                c++;
            else break;
        }
        }
        return c;
    }
}
