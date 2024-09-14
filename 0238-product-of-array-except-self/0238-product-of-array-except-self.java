class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int mul=1;
        int [] ex=new int[n];
        int [] l=new int[n];
        l[0]=1;
        for(int i=1;i<n;i++)
        {
            l[i]=l[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=n-1;i>=0;i--)
        {
            ex[i]=l[i]*r;
            r=r*nums[i];
        }
        return ex;
    }
}