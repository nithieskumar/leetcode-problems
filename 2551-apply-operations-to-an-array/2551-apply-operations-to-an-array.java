class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                nums[i-1]=nums[i]*2;
                nums[i]=0;
            }

        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n)
        {
            nums[j]=0;
            j++;
        }
        return nums;
    }
}