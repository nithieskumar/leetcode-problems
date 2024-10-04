class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int[]a=new int[k];
        for(int i:arr)
        {
            a[((i%k)+k)%k]++;
        }
        if(a[0]%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++)
        {
            if(a[i]!=a[k-i])
            {
                return false;
            }
        }
        return true;


    }
}