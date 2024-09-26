class Solution {
    public int findPoisonedDuration(int[] t, int d){
        int n=t.length;
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            if(t[i+1]<=t[i]+d)
            {
                k+=t[i+1]-t[i];
            }
            else{
                k+=d;
            }
        }
        k+=d;
        return k;
    }
}