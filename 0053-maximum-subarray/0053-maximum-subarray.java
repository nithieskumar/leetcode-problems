class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int n=nums.length;
        int m=nums[0];
        for(int i=0;i<n;i++)
        {
            max=max+nums[i];
            m=max>m?max:m;
        if(max<0)
        {
            max=0;
        }
        }
        return m;
    }
}