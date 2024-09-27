class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] m=new int[mat.length][2];
        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum+=mat[i][j];
            }
            m[i][0]=sum;
            m[i][1]=i;
        }
        Arrays.sort(m,(a,b)->
        {
            if(a[0]==b[0])
            {
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[]b=new int[k];
        for(int i=0;i<k;i++)
        {
            b[i]=m[i][1];
        }
        return b;

    }
}