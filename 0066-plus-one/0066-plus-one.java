class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]!=9)
            {
                a[i]+=1;
                return a;
            }
            a[i]=0;
        }
        int[] b=new int[n+1];
        b[0]=1;
        return b;
    }
}