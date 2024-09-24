class Solution {
    public boolean searchMatrix(int[][] m, int k) {
        int i=0;
        int j=m[0].length-1;
        while(i<=m.length-1&&j>=0)
        {
            if(k==m[i][j])
            {
                return true;
            }
            else if(k<m[i][j])
            {
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}