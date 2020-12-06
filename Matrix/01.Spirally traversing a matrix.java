//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<>();
        int top = 0,down=r-1,left=0,right=c-1;
        int dir = 0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    al.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=down;i++){
                    al.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    al.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3){
                for(int i=down;i>=top;i--){
                    al.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return al;
    }
}
